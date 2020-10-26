public class Developer {
    private String name;
    private String title;
    private long mobile;

    public Developer(String title, String name, long mobile ){
        super();
        this.title = title;
        this.name = name;
        this.mobile = mobile;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMobile(long mobile){
        this.mobile = mobile;
    }

    public String getTitle(){
        return title;
    }

    public String getName(){
        return name;
    }

    public long getMobile(){
        return mobile;
    }

    @Override
    public String toString(){
        return " Name = " + name + ", Mobile = " + mobile ;
    }
}
