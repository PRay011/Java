package 第三题;

public class Third {
    public static void main(String[] args) {
        int Num=(int)(Math.random()*52)+1;
        String Color= " ";
        String Number=" ";
        if(1<=Num&&Num<=13)
        {
            Color="Diamond";
            if(Num==1)
            {
                Number="Ace";
            }
            else if(1<Num&&Num>=10)
            {
                Number=String.valueOf(Num);
            }
            else if(Num==11)
            {
                Number="Jack";
            }
            else if(Num==12)
            {
                Number="Queen";
            }
            else
            {
                Number="King";
            }
        }
        else if(14<=Num&&Num<=26)
        {
            Color="Heart";
            if(Num==14)
            {
                Number="Ace";
            }
            else if(14<Num&&Num>=23)
            {
                Number=String.valueOf(Num-14);
            }
            else if(Num==24)
            {
                Number="Jack";
            }
            else if(Num==25)
            {
                Number="Queen";
            }
            else
            {
                Number="King";
            }
        }
        else if(27<=Num&&Num<=39)
        {
            Color="Spades";
            if(Num==27)
            {
                Number="Ace";
            }
            else if(27<Num&&Num>=36)
            {
                Number=String.valueOf(Num-27);
            }
            else if(Num==37)
            {
                Number="Jack";
            }
            else if(Num==38)
            {
                Number="Queen";
            }
            else
            {
                Number="King";
            }
        }
        else if(40<=Num&&Num<=52)
        {
            Color="Clubs";
            if(Num==40)
            {
                Number="Ace";
            }
            else if(40<Num&&Num>=49)
            {
                Number=String.valueOf(Num-40);
            }
            else if(Num==50)
            {
                Number="Jack";
            }
            else if(Num==51)
            {
                Number="Queen";
            }
            else
            {
                Number="King";
            }
        }
        System.out.println("Color:"+Color);
        System.out.println("Number:"+Number);
    }
}
