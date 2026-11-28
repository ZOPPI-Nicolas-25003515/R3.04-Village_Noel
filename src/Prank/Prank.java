public static class Prank {

    protected static enum PrankType {
        MAGIC_MILK(8, "lait magique"),
        STOCKINGS_SOUP(6, "soupe aux bas"),
        ROLLED_TOILET_PAPER(5, "papier toilette roulé"),
        DARTING_EYES(8, "yeux remuants"),
        ZIP_LINE(6, "tyrolienne"),


        private final int christmasValue;


        private Prank(int christmasValue){
            this.christmasValue = christmasValue;
         }

        public int getChristmasValue(){
            return christmasValue;
        }

    }

}

