package org.launchcode.techjobs_oo;

public class PositionType extends JobField {
    public PositionType() {
    }

    public PositionType(String value) {
        super(value);
    }
    //    public PositionType() {
//        id = nextId;
//        nextId++;
//    }
//
//    public PositionType(String value) {
//        this();
//        this.value = value;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;

        PositionType that = (PositionType) o;

        if (getId() != that.getId()) return false;
        return getValue().equals(that.getValue());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getValue().hashCode();
        return result;
    }


}