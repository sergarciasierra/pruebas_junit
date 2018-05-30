
public class Calculadora {
    private int ans;
    public Calculadora(){
    	ans = 0;
    }
	public int suma(int a, int b) {
		ans = a + b;
        return ans;
    }

	public int resta(int a, int b) {
		ans = a -b;
        return ans;
    }
	
	public int suma(int s) {
		ans += s;
		return ans;
	}
	
	public int resta(int r) {
		ans -= r;
		return ans;
	}
	
	public int ans() {
		return ans;
	}
	
	public int clear() {
		ans = 0;
		return ans;
	}

}
