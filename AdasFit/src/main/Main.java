package main;

import java.util.*;

public class Main {
	static Person  p = new Person();
	public static Day[] arrDay = new Day[100];
	public static int i=0;
	public static int j=0;
	public static String[] foodlist= new String[100]; 
	public static void main(String [] args) {
		int totalcal;
		String date = null;
		String program = null;
		Daily d = new Daily(0, 0, 0, 0);
		Food add = new Food("0", 0, 0, 0, 0);
		add = FoodList.Baklava;
		program = ProgramFind(p);
		//FoodList.list[0]=FoodList.Baklava;
		//EndofDay(arrDay,i, date, d);
		
	}
	
	
public static Daily AddFood(Food add, Daily d ) {
	d.dailyCal += add.cal;
	d.dailyCarb += add.carb;
	d.dailyFat += add.fat;
	d.dailyProtein += add.protein;
	
	return d;
}

public static Daily SubFood(Food add, Daily d ) {
	d.dailyCal -= add.cal;
	d.dailyCarb -= add.carb;
	d.dailyFat -= add.fat;
	d.dailyProtein -= add.protein;
	
	return d;
}

	

	
public static String ProgramFind(Person p) {
	
	
	String program = null;
	
	if (p.sex == "m") {
		if (p.aim == "1") {
			program = "Male weight loss program\r\n" + 
					"\r\n" + 
					"Warm-up:\r\n" + 
					"\r\n" + 
					"Cat/Cow Pose (10 each)\r\n" + 
					"Glute Bridge (10 reps)\r\n" + 
					"Lateral Lunge (10 reps each side)\r\n" + 
					"Backward Lunge (10 reps each side)\r\n" + 
					"Knee Hug (10 reps each side)\r\n" + 
					"Butt Kicks (10 reps each side)\r\n" + 
					"\r\n" + 
					"Main part:\r\n" + 
					"\r\n" + 
					"Day 1:\r\n" + 
					"\r\n" + 
					"Leg Press	8-12	3	2-3 minutes\r\n" + 
					"DB Bench press	8-12	3	2-3 minutes\r\n" + 
					"Lying/Seated leg curl	8-12	3	2-3 minutes\r\n" + 
					"Seated row	8-12	3	2-3 minutes\r\n" + 
					"Leg extension	8-12	3	2-3 minutes\r\n" + 
					"Standing calf raise	8-12	3	2-3 minutes\r\n" + 
					"\r\n" + 
					"Day 2:\r\n" + 
					"\r\n" + 
					"Lateral raise	10-15	3	2-3 minutes\r\n" + 
					"DB flyes	10-15	3	2-3 minutes\r\n" + 
					"DB narrow press	10-15	3	2-3 minutes\r\n" + 
					"Barbell bicep curl	10-15	3	2-3 minutes\r\n" + 
					"\r\n" + 
					"Day 3:\r\n" + 
					"\r\n" + 
					"DB Deadlift	8-12	3	2-3 minutes\r\n" + 
					"Pulldown	8-12	3	2-3 minutes\r\n" + 
					"DB Step-ups	8-12	3	2-3 minutes\r\n" + 
					"DB Shoulder press	8-12	3	2-3 minutes\r\n" + 
					"Seated calf raise	8-12	3	2-3 minutes\r\n" + 
					"Split squat	6-10 per side	3	2-3 minutes\r\n" + 
					"\r\n" + 
					"Day 4:\r\n" + 
					"\r\n" + 
					"Reverse flyes	10-15	3	2-3 minutes\r\n" + 
					"DB hammer curl	10-15	3	2-3 minutes\r\n" + 
					"Rope triceps extension	10-15	3	2-3 minutes\r\n" + 
					"DB Single arm row	10-15	3	2-3 minutes\r\n";
		}
		
		else if (p.aim == "2") {
			program = "Male weight stabilization program:\r\n" + 
					"\r\n" + 
					"Warm-up:\r\n" + 
					"Cobra Pose (10 reps)\r\n" + 
					"Knee Hug (10 each side)\r\n" + 
					"Inverted Hamstring (10 reps)\r\n" + 
					"Lateral Lunge (10 reps each side)\r\n" + 
					"Front-Plank (Hold for 30 sec.)\r\n" + 
					"\r\n" + 
					"Day 1:\r\n" + 
					"Chest – Barbell Bench Press – 4 sets of 8 reps\r\n" + 
					"Back – Lat-pulldowns – 4 sets of 10 reps\r\n" + 
					"Shoulders – Seated Dumbbell Press – 4 sets of 10 reps\r\n" + 
					"Legs – Leg Extensions – 4 sets of 10 reps\r\n" + 
					"Biceps – Barbell Bbicep Curls – 3 sets of 10 reps\r\n" + 
					"Triceps – Triceps Rope Pushdowns – 3 sets of 15 reps\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"Day 2:\r\n" + 
					"Legs – Leg Press Machine – 4 sets of 8 reps\r\n" + 
					"Triceps – Overhead Bar Extensions – 3 sets of 20 reps\r\n" + 
					"Biceps – EZ Bar Curls – 4 sets of 10 reps\r\n" + 
					"Chest – Machine Chest Press – 4 sets of 10 reps\r\n" + 
					"Back – T-Bar Row – 4 sets of 10 reps\r\n" + 
					"Shoulders – Lateral Raises – 3 sets of 20 reps\r\n" + 
					"\r\n" + 
					"Day 3:\r\n" + 
					"Shoulders – EZ Bar Upright Rows – 3 sets of 15 reps\r\n" + 
					"Back – Close-Grip Pulldowns – 4 sets of 12 reps\r\n" + 
					"Chest – Cable Fly – 4 sets of 10 reps\r\n" + 
					"Legs – Lunges – 3 sets of 10 reps per leg\r\n" + 
					"Triceps – Skullcrushers – 3 sets of 15 reps\r\n" + 
					"Biceps – Hammer Curls – 3 sets of 12 reps\r\n";
		}
		
		else if (p.aim == "3") {
			program = "Warm-up:\r\n" + 
					"\r\n" + 
					"Front-Plank (Hold for 30 sec.)\r\n" + 
					"Side-Plank (set of 10 each side, hold for 2 sec. each)\r\n" + 
					"Cat/Cow Pose (10 each)\r\n" + 
					"Glute Bridge (10 reps)\r\n" + 
					"\r\n" + 
					"Day 1:\r\n" + 
					"Incline Dumbbell Press Set: 1, Reps: 6, Rest: 60 seconds\r\n" + 
					"Bentover Row Sets: 3, Reps: 8-10, Rest: 45 seconds\r\n" + 
					"Bentover Lateral Raise Sets: 3, REPS: 12-15, Rest: 30 Seconds\r\n" + 
					"Weighted Swiss Ball Crunch Sets: 3, Reps: 10-15, Rest: 30 seconds\r\n" + 
					"\r\n" + 
					"Day 2:\r\n" + 
					"Bentover Row Sets: 1*, Reps: 6, Rest: 60 seconds\r\n" + 
					"Dumbbell Stepup Sets: 3, Reps: 6-8, Rest: 45 seconds\r\n" + 
					"Good Morning Sets: 3, Reps: 6-8, Rest: 45 seconds\r\n" + 
					"Reverse Crunch Sets: 3, Reps: 15-20, Rest: 30 seconds\r\n" + 
					"\r\n" + 
					"Day 3:\r\n" + 
					"Dumbbell Bench Press SETS: 1*, Reps: As many as possible, Rest: 60 seconds\r\n" + 
					"Dumbbell Seated Shoulder Press Sets: 3, Reps: 10-12, Rest: 45 seconds\r\n" + 
					"Seated Dumbbell Curl Sets: 3, Reps: 8-10, Rest: 30 Seconds\r\n" + 
					"Chinup Sets: 3, Reps: 6-8, Rest: 45 Sec\r\n" + 
					"Cable Woodchop Sets: 3 Reps: 12-15, Rest: 30 Seconds\r\n";
		}
	}
	
	else {
		if (p.aim == "1") {
			program = "female weight loss program \r\n" + 
					"\r\n" + 
					"Warm-up:\r\n" + 
					"\r\n" + 
					"Cobra Pose (10 reps)\r\n" + 
					"Knee Hug (10 each side)\r\n" + 
					"Inverted Hamstring (10 reps)\r\n" + 
					"Lateral Lunge (10 reps each side)\r\n" + 
					"Front-Plank (Hold for 30 sec.)\r\n" + 
					"Side-Plank (set of 10 each side, hold for 2 sec. each)\r\n" + 
					"\r\n" + 
					"Day 1:\r\n" + 
					"\r\n" + 
					"30 seconds: Full-out sprint\r\n" + 
					"60 seconds: Moderate pace jog\r\n" + 
					"Do 12x.\r\n" + 
					"\r\n" + 
					"Day 2:\r\n" + 
					"\r\n" + 
					"Lying Isometric Y—Hold for 30 \r\n" + 
					"Box Step-Ups—15 reps each leg.\r\n" + 
					"Plank—Hold for 30 seconds.\r\n" + 
					"\r\n" + 
					"Day 3:\r\n" + 
					"\r\n" + 
					"Bodyweight Squats—15 reps. \r\n" + 
					"Dumbbell Bench Press—12 reps. \r\n" + 
					"Dumbbell Row—12 reps each side.\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"Day 4:\r\n" + 
					"\r\n" + 
					"30 seconds: Full-out sprint\r\n" + 
					"Box Step-Ups—15 reps each leg.\r\n" + 
					"Dumbbell Bench Press—12 reps. \r\n";
		}
		
		else if (p.aim == "2") {
			program = "female weight stabilization program:\r\n" + 
					"\r\n" + 
					"Warm-up:\r\n" + 
					"\r\n" + 
					"Lateral Lunge (10 reps each side)\r\n" + 
					"Backward Lunge (10 reps each side)\r\n" + 
					"Knee Hug (10 reps each side)\r\n" + 
					"Butt Kicks (10 reps each side)\r\n" + 
					"\r\n" + 
					"Day 1:\r\n" + 
					"Lat Pull-down: 2 warm-up sets of 12 reps, 1 working set of 10 reps\r\n" + 
					"Bent-Over Barbell Rows: 2 warm-up sets of 12 reps, 1 working set of 10 reps\r\n" + 
					"Seated Cable Row: 1 warm-up set of 12 reps, 1 working set of 10 reps\r\n" + 
					"Deadlifts: 1 warm-up set of 12 reps, 1 working set of 10 reps\r\n" + 
					"\r\n" + 
					"Day 2:\r\n" + 
					"Leg Extension: 2 warm-up sets of 20 reps, 1 working set of 20 reps\r\n" + 
					"Squats: 2 warm-up sets of 12 reps, 1 working set of 20 reps\r\n" + 
					"Lying Leg Curl: 1 warm-up set of 15 reps, 1 working set of 20 reps\r\n" + 
					"Stiff-Legged Deadlifts: 1 warm-up set of 12 reps, 1 working set of 20 reps\r\n" + 
					"\r\n" + 
					"Day 3:\r\n" + 
					"Seated Dumbbell Curl Sets: 3, Reps: 8-10, Rest: 30 Seconds\r\n" + 
					"Chinup Sets: 3, Reps: 6-8, Rest: 45 Sec\r\n" + 
					"Cable Woodchop Sets: 3 Reps: 12-15, Rest: 30 Seconds\r\n" + 
					"Incline Dumbbell Press Set: 3, Reps: 6-8, Rest: 45 seconds";
		}
		
		else if (p.aim == "3") {
			program = "female weight gain program\r\n" + 
					"\r\n" + 
					"Warm-up:\r\n" + 
					"\r\n" + 
					"Knee Hug (10 each side)\r\n" + 
					"Glute Bridge (10 reps)\r\n" + 
					"Lateral Lunge (10 reps each side)\r\n" + 
					"Front-Plank (Hold for 30 sec.)\r\n" + 
					"\r\n" + 
					"Day 1:\r\n" + 
					"\r\n" + 
					"Biceps Curl with Barbell: 2 warm-up sets of 12 reps, 1 working set of 10 reps\r\n" + 
					"Hammer Dumbbell Curls: 1 warm-up set of 12 reps, 1 working set of 10 reps\r\n" + 
					"Preacher Curl with Barbell: 1 warm-up set of 12 reps, 1 working set of 10 reps\r\n" + 
					"Skull Crushers: 2 warm-up sets of 12 reps, 1 working set of 10 reps\r\n" + 
					"Tricep Extension with Dumbbell: 1 warm-up set of 12 reps, 1 working set of 10 reps\r\n" + 
					"Push-downs with Rope: 1 warm-up set of 12 reps, 1 working set of 10 reps\r\n" + 
					"\r\n" + 
					"Day 2:\r\n" + 
					"\r\n" + 
					"Incline Dumbbell Presses: 2 warm-up sets of 12 reps, 1 working set of 10 reps\r\n" + 
					"Incline Flyes with Dumbbells: 1 warm-up set of 12 reps, 1 working set of 10 reps\r\n" + 
					"Flat Bench: 1 warm-up set of 12 reps, 1 working set of 10 reps\r\n" + 
					"Decline Bench: 1 warm-up set of 12 reps, 1 working set of 10 reps\r\n" + 
					"Sit-ups with Weight: 3 sets to failure\r\n" + 
					"Weighted Leg Raises: 3 sets to failure\r\n" + 
					"\r\n" + 
					"Day 3:\r\n" + 
					"\r\n" + 
					"Military Press in Front: 2 warm-up sets of 12 reps, 1 working set of 10 reps\r\n" + 
					"Side raises: 1 warm-up set of 12 reps, 1 working set of 10 reps\r\n" + 
					"Bent-Over Rear-Delt Raises: 1 warm-up set of 12 reps, 1 working set of 10 reps\r\n" + 
					"Front Raises with Dumbbells: 1 warm-up set of 12 reps, 1 working set of 10 reps\r\n" + 
					"Shrugs: 1 warm-up set of 12 reps, 1 working set of 10 reps";
		}
	}
	
	return program;
	
	
}


public static Daily EndofDay(Day arrDay[], int i, String date, Daily d) {

	arrDay[i].cal = d.dailyCal;
	arrDay[i].date = date;
	arrDay[i].carb = d.dailyCarb;
	arrDay[i].protein = d.dailyProtein;
	arrDay[i].carb = d.dailyCarb;
	
	d = new Daily(0,0,0,0);
	
	return d;
}


public static int CalculateCal(Person p) {
	if (p.sex == "m") {
		p.BMR = (float) ((float) 10* (p.weight) + 6.25 * p.height - 5* p.age + 5);
		if (p.activity == "1") {
			p.BMR = (float) (p.BMR * 1.2);
		}
		
		else if (p.activity == "2") {
			p.BMR = (float) (p.BMR * 1.375);
		}
		
		else if (p.activity == "3") {
			p.BMR = (float) (p.BMR * 1.55);
		}
		
		else if (p.activity == "4") {
			p.BMR = (float) (p.BMR * 1.725);
		}
		
		else if (p.activity == "5") {
			p.BMR = (float) (p.BMR * 1.9);
		}
	}
	
	
	else if (p.sex == "f") {
		p.BMR = (float) ((float) 10* (p.weight) + 6.25 * p.height - 5* p.age - 161);
		if (p.activity == "1") {
			p.BMR = (float) (p.BMR * 1.2);
		}
		
		else if (p.activity == "2") {
			p.BMR = (float) (p.BMR * 1.375);
		}
		
		else if (p.activity == "3") {
			p.BMR = (float) (p.BMR * 1.55);
		}
		
		else if (p.activity == "4") {
			p.BMR = (float) (p.BMR * 1.725);
		}
		
		else if (p.activity == "5") {
			p.BMR = (float) (p.BMR * 1.9);
		}
	}
	
	if (p.aim == "1") {
		p.calNeed = (int) (p.BMR - 500);
	}
	
	else if (p.aim == "3") {
		p.calNeed = (int) (p.BMR + 500);
	}
	else {
		p.calNeed = (int) (p.BMR + 0);
	}
	return p.calNeed;
}
}