package scrap.app.party;

public class Party {
    
    private final Cake cake;
    private final Balloon balloon;
    private final Type type;
    
    // Builder is an overkill for this class as it stands
    // It might be worth adding date of celebration, guest list, venue and more before switching to builder pattern
    public Party(Type type, Cake cake, Balloon balloon) {
        this.cake = cake;
        this.balloon = balloon;
        this.type = type;
    }
    
    public Cake getCake() {
        return cake;
    }

    public Balloon getBalloon() {
        return balloon;
    }
    
    public String getDescription() {
        return type.getGreetingWishes() + " " + balloon.getDescription() + " " + cake.getDescription();
                
    }
    
    public static enum Type {
        BIRTHYDAY("Happy birthday!"), WEDDING ("Best wishes on your marraige."), PROMOTION ("Congratulations!");
       
        private final String wishes;
        Type(String wishes) {
            this.wishes = wishes;
        }
        
        public String getGreetingWishes() {
            return wishes;
        }
    }
    
}
