package day09;

public class Solution01 {
    public int solution(int hp) {
        int answer = 0;
        int general = 0;
        int soldier = 0;
        int work = 0;
        
        while(hp > 0) {
            if(hp - 5 >= 0) {
                hp -= 5;
                general++;
                continue;
            } else if(hp - 3 >= 0) {
                hp -= 3;
                soldier++;
                continue;
            } else if(hp - 1 >= 0) {
                hp -= 1;
                work++;
                continue;
            } else {
                break;
            }
            
        }
        
        answer = general + soldier + work;
        
        return answer;
    }
}
