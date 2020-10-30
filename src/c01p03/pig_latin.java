package c01p03;

public class pig_latin {

	public static void main(String[] args) {
		
		String nameFirst = "andre";
		String nameLast = "hochi";
		String pigLatin;
		
		pigLatin = nameFirst.substring(1,2).toUpperCase() + nameFirst.substring(2) + nameFirst.substring(0,1) + "ay" + " " + nameLast.substring(1,2).toUpperCase() + nameLast.substring(2) + nameLast.substring(0,1) + "ay";
		
		System.out.println("For first name " + nameFirst + " and last name " + nameLast + " your pig latin name is " + pigLatin);

		

	}

}
