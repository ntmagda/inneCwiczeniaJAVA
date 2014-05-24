
public class SystemKontrolny {
	int Up;
	int Right;
	int Forward;
	
	void up( int wartosc){ Up+=wartosc;	};
	void down( int wartosc){ Up-=wartosc; };
	void right( int wartosc){ Right+=wartosc; };
	void left( int wartosc){ Right-=wartosc; };
	void forward( int wartosc){ Forward+=wartosc; };
	void back ( int wartosc){ Forward-=wartosc; };
}

