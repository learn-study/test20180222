//Q3 以下のプログラムの実行例になるようにDogクラスを作成してください。		
//	※実行例	
//	犬の名前は太郎です。年齢は3歳です。	
//	犬の名前はホワイトです。年齢はわかりませんでした。	

class Dog{
    public Dog(String name, int age){
        System.out.println("犬の名前は" + name + "です。年齢は" + age + "です。");
    }
    public Dog(String name){
        System.out.println("犬の名前は" + name + "です。年齢はわかりませんでした。");
    }
}

class Test3{
    public static void main(String[] args){
        
        Dog dog1 = new Dog("シロ",3);
        Dog dog2 = new Dog("ホワイト");
 
    }
}