public class LabeledBox extends Box implements Drawable {

    private String label;
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }


    LabeledBox( int length , int width , String lab ){
        super(length,width);
        this.label = lab;
    }


    public String draw(){
        return "Drawing Box with dimensions: (" + super.getLength() + "," + super.getWidth() + ") with label: "+ this.getLabel();
    }
}
