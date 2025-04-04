class Marksheet {
    private Double physics,mathematics,chemistry,english,Hindi;
    public void setphysics(Double physics){
        this.physics=physics;
    }
    public void setmathematics(Double mathematics){
        this.mathematics = mathematics;
    }
    public void setchemistry(Double chemistry){
        this.chemistry = chemistry;
    }
    public void setEnglish(Double english) {
        this.english = english;
    }
    public void setHindi(Double hindi) {
        this.Hindi = hindi;
    }
    public Double getChemistry() {
        return chemistry;
    }
    public Double getPhysics() {
        return physics;
    }
    public Double getMathematics() {
        return mathematics;
    }
    public Double getEnglish() {
        return english;
    }
    public Double getHindi() {
        return Hindi;
    }
    public Double getmaxmarks(){
        Double max=0.00;
        if(max<physics){
            max=physics;
        }
        if(max<mathematics){
            max=mathematics;
        }
        if(max<chemistry){
            max=chemistry;
        }
        if(max<english){
            max=english;
        }
        if(max<Hindi){
            max=Hindi;
        }
        return max;
    }
    public static void main(String[] args) {
        Marksheet s1 = new Marksheet();
        s1.setphysics(67.00);
        s1.setmathematics(66.00);
        s1.setEnglish(67.00);
        s1.setHindi(80.00);
        s1.setchemistry(90.00);
        System.out.println(s1.getmaxmarks());
    }      
}
