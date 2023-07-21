import java.util.ArrayList;
public class TaskMngr
{

   private ArrayList<String> Tasks=new ArrayList<>();
    
    
    

        


    public void populateArray(){


		Tasks.add("First");
		Tasks.add("Second");
		Tasks.add("Third");

	}
    public void addTasks(String noweZadanie){
		int size=Tasks.size();
        Tasks.add(noweZadanie);

        
    }
    public void viewAll(){

//		int size=Tasks.size();
//		for(int i=1; i<=size;i++){
//			int
//			String j =toString();
//			Tasks.add(i,j);
////
//		}
		System.out.println(Tasks);

        
    }
    public void del(int numb){
		int size=Tasks.size();
//		System.out.println(size);
//		for(int i=1; i<=size;i++){
//
//			System.out.println(i);
//		}
		Tasks.remove(numb-1);
    }
	public void mark(int sign){
		String modifyTask=Tasks.get(sign-1)+ "*";
		Tasks.set(sign-1, modifyTask);



	}




		
	}

