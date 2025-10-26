import java.util.regex.*;
public class REgex {
    public static void main(String[] args) {
        // String line="xy java pg java uv";
        // Pattern p=Pattern.compile("java");
        // Matcher m=p.matcher(line);
        // while (m.find()) {
        //     System.out.println(m.start()+"\t"+m.end()+"\t"+m.group());
        // }/

        //EXAMPLE 2->
        // String line="49 xy 361 uv";
        // Pattern p=Pattern.compile("\\d");
        // Matcher m=p.matcher(line);
        // while (m.find()) {
        //     System.out.println(m.start()+"\t"+m.end()+"\t"+m.group());
        // }

        //EXAMPLE 3->
        // String line="49 xy 361 uv";
        // Pattern p=Pattern.compile("\\d+");
        // Matcher m=p.matcher(line);
        // while (m.find()) {
        //     System.out.println(m.start()+"\t"+m.end()+"\t"+m.group());
        // }

        // EXAMPLE 4->
        // String line="b z a x c y";
        // Pattern p=Pattern.compile("abc"); NO OUTPUT
        // Matcher m=p.matcher(line);
        // while (m.find()) {
        //     System.out.println(m.start()+"\t"+m.end()+"\t"+m.group());
        // }

        // EXAMPLE 5->
        // String line="b z a x c y";
        // Pattern p=Pattern.compile("[abc]");
        // Matcher m=p.matcher(line);
        // while (m.find()) {
        //     System.out.println(m.start()+"\t"+m.end()+"\t"+m.group());
       // }

        // EXAMPLE 6->
        // String line="b z a x c y";
        // Pattern p=Pattern.compile("[a-f]");
        // Matcher m=p.matcher(line);
        // while (m.find()) {
        //     System.out.println(m.start()+"\t"+m.end()+"\t"+m.group());
        // }

        // EXAMPLE 7->
        // String line="b z G x C y";
        // Pattern p=Pattern.compile("[a-fA-F]");
        // Matcher m=p.matcher(line);
        // while (m.find()) {
        //     System.out.println(m.start()+"\t"+m.end()+"\t"+m.group());
        // }

        // EXAMPLE 8->
        // String line="b z a x c y";
        // Pattern p=Pattern.compile("[^ abc]");
        // Matcher m=p.matcher(line);
        // while (m.find()) {
        //     System.out.println(m.start()+"\t"+m.end()+"\t"+m.group());
        // }

        // EXAMPLE 9->
        // String line="8java9 xy 2java4 pq";
        // Pattern p=Pattern.compile("(\\d)(java)(\\d)");
        // Matcher m=p.matcher(line);
        // while (m.find()) {
        //     System.out.println(m.start()+"\t"+m.end()+"\t"+m.group());
        // }

        // EXAMPLE 10->
        // String line="8java9 xy 2java4 pq";
        // Pattern p=Pattern.compile("(\\d)(java)(\\d)");
        // Matcher m=p.matcher(line);
        // while (m.find()) {
        //     System.out.println(m.start(3)+"\t"+m.end(3)+"\t"+m.group(3));
        // }

        //EXAMPLE 11->
        String line="I like php php and Php";
        Pattern p=Pattern.compile("[Pp](hp)");
        Matcher m=p.matcher(line);
        String newline=null;
        while (m.find()) {
            newline=m.replaceAll("java");
            System.out.println(newline);
        }
    }
}