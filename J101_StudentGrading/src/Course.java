public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int quizNote;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.quizNote = 0;
    }
    
    
    public void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem Başarılı");
        }else {
            System.out.println("Öğretmen " + t.name + " bu dersi veremez.");
        }
    }
    
    public void showTeacher(){
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin öğretmeni : " + courseTeacher.name);
        }else {
            System.out.println(this.name + " dersine öğretmen atanmamıştır.");
        }
    }
    
    
}
