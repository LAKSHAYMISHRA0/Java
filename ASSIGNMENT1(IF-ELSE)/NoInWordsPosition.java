public class NoInWordsPosition {
    public static void main(String[] args) {
        int no;
        no=(int)(Math.random()*10000);
        System.out.println("the generated no. is-->"+no);
        int a,b,c,d;
        a=no%10;
        b=(no/10)%10;
        c=(no/100)%10;
        d=(no/1000)%10;
        switch (d){
            case 1:
                System.out.print("One Thousand");
                break;
            case 2:
                System.out.print("Two thousand");
                break;
            case 3:
                System.out.print("three thousand");
                break;
            case 4:
                System.out.print("four thousand");
                break;
            case 5:
                System.out.print("five thousand");
                break;
            case 6:
                System.out.print("Six thousand");
                break;
            case 7:
                System.out.print("Seven thousand");
                break;
            case 8:
                System.out.print("Eight thousand");
                break;
            case 9:
                System.out.print("Nine thousand");
                break;
            default:
            System.out.println("invalid !!");
                break;
        }
        switch (c) {
                case 1:
                    System.out.print(" one hundered");
                    break;
                case 2:
                    System.out.print(" two hundered");
                    break;
                case 3:
                    System.out.print(" three hundered");
                    break;
                case 4:
                    System.out.print(" four hundered");
                    break;
                case 5:
                    System.out.print(" five hundered");
                    break;
                case 6:
                    System.out.print(" Six hundered");
                    break;
                case 7:
                    System.out.print(" Seven hundered");
                    break;
                case 8:
                    System.out.print(" Eight hundered");
                    break;
                case 9:
                    System.out.print(" Nine hundered");
                    break;
                default:
                System.out.println("invalid !!");
                    break;
        }
        switch (b) {
            case 1:
                System.out.print(" ten");
                break;
            case 2:
                System.out.print(" twenty");
                break;
            case 3:
                System.out.print(" thirty");
                break;
            case 4:
                System.out.print(" fourty");
                break;
            case 5:
                System.out.print(" fifty");
                break;
            case 6:
                System.out.print(" Sixty");
                break;
            case 7:
                System.out.print(" Seventy");
                break;
            case 8:
                System.out.print(" Eighty");
                break;
            case 9:
                System.out.print(" Ninety");
                break;
            default:
            System.out.println("invalid !!");
                break;
        }switch (a) {
            case 1:
                System.out.print(" one");
                break;
            case 2:
                System.out.print(" two");
                break;
            case 3:
                System.out.print(" three");
                break;
            case 4:
                System.out.print(" four");
                break;
            case 5:
                System.out.print(" five");
                break;
            case 6:
                System.out.print(" Six");
                break;
            case 7:
                System.out.print(" Seven");
                break;
            case 8:
                System.out.print(" Eight");
                break;
            case 9:
                System.out.print(" Nine");
                break;
            
        }
    }
}