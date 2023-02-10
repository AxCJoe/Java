package JSample;

 class Computer {
        int computerNo;
        String name;
        public Computer() {
        }
        void setComputerNo (int newComputerNo) {
            computerNo = newComputerNo;
        }
        void setName(String newName) {
            name = newName;
        }
        void dispComputer() {
            System.out.println(name + "さんが使っているパソコンは " + computerNo + "号機です");
        }
    
}
