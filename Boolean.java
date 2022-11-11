/*
*Java supports some boolean operators like
*!, ||, and && in addition to the == operator.
*All these can be used together with the true and false
*values to make decisions.
*/
class AroundTheHouse {
    public static boolean canArrangeFire(boolean fireIsOff) {
        return fireIsOff == false;
    }
//In this example below, it is useless to spy them if at least one of them is not awake.
    public static boolean canSpyAround(boolean mommyIsAwake, boolean daddyIsAwake) {
        return mommyIsAwake == true || archerIsAwake == true;
    }
//Below, if the parents are around, don't try. If she is not around too, it will be a waste of time.
    public static boolean canSeeHer(boolean parentsAreAround, boolean sheIsAround) {
        return parentsAreAround == false && sheIsAround == true;
    }
//From here, you can test larger and more complex situations by simply knowing how you intend to do interrogations.
}
