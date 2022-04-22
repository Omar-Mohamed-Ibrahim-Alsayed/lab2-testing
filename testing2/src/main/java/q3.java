public class q3 {

    String state = "NORMAL";
    String state1 = "TIME";
    String state2 = "min";
    String state3 = "ALARM";
    int m=0,h=0, D=1,M=1, Y=2000;


    void IO(char x){
        switch(state) {
            case "NORMAL": {
                if (x == 'c')
                    state = "UPDATE";
                if (x == 'b')
                    state = "ALARM";
                if (x == 'a')
                    if (state1 == "TIME")
                        state1 = "DATE";
                    else
                        state1 = "TIME";
            }
            case "UPDATE":
                if (x == 'd')
                    state = "NORMAL";
                else if (x == 'c')
                    state = "UPDATE";
                else {
                    switch (state2) {
                        case "min": {
                            if (x == 'a')
                                state2 = "hour";
                            if (x == 'b')
                                m = (m+1)%60;
                        }
                        case "hour": {
                            if (x == 'a')
                                state2 = "day";
                            if (x == 'b')
                                h= (h+1)%12 +1;
                        }
                        case "day": {
                            if (x == 'a')
                                state2 = "mounth";
                            if (x == 'b')
                                D= (D+1)%30 + 1;
                        }
                        case "mounth": {
                            if (x == 'a')
                                state2 = "year";
                            if (x == 'b')
                                M= (M+1)%12+1;
                        }
                        case "year": {
                            if (x == 'a')
                                state = "NORMAL";
                            if (x == 'b')
                                Y= (Y+1)%100;
                        }
                    }

                }
            case "ALARM":
                if(x == 'd')
                    state = "NORMAL";
                else if (x == 'a')
                    if(state3 == "ALARM")
                        state3 = "CHIME";
                else
                    state = "ALARM";
        }
    }

    void DisplayDate() {System.out.println(Y+"-"+M+"-"+D); }
    void DisplayTIME() {System.out.println( h+":"+m);}

}
