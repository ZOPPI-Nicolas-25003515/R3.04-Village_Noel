public class Food {


    protected static enum FoodType {
        BISCUITS(15),
        HOT_CHOCOLATE(10),
        MARSHMALLOW(10),
        OATMEAL(30),
        BARELY_SUGAR(15),
        CANDIES(10);



        private final int nutritionalValue;

        private Food(int nutritionalValue) {
            this.nutritionalValue = nutritionalValue;
        }

        public int getNutritionalValue() {
            return nutritionalValue;
        }
        
    }


}

