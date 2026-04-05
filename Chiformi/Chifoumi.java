public class Chifoumi {
    
    public static ChifoumiAction getActionBeatenBy(ChifoumiAction chifoumiAction) {
    

       switch (chifoumiAction) {
            case ROCK: 
                return  ChifoumiAction.SCISSOR;
                break;
                    
            case PAPER:
                return  ChifoumiAction.ROCK;
                break;      
            case SCISSOR :
                return  ChifoumiAction.PAPER;
                break;                   
            default:
                break;
        }
    }
}