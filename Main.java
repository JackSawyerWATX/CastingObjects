class Main{

    public static void train(Athlete athlete){
        athlete.print();
    }

    public static void train2(Athlete athlete){

        if (athlete instanceof Snowboarder) {
            //this is downcasting
            Snowboarder snowboarder = (Snowboarder)athlete;
            System.out.println("I am a snowboarder and my snowboard is " + snowboarder.boardColor + ".");
        } else if (athlete instanceof BasketballPlayer){
            BasketballPlayer ballPlayer = (BasketballPlayer)athlete;
            System.out.println("I am a basketball player and I can fly " + ballPlayer.jumpHeight + " kilometers.");
        }
    }
    public static void main(String[] args) {
        Snowboarder snowboarder = new Snowboarder();
        BasketballPlayer ballPlayer = new BasketballPlayer();
        
        //this is upcasting
        train(snowboarder);
        train(ballPlayer);

        //this is downcasting
        train2(snowboarder);
        train2(ballPlayer);
    }
}