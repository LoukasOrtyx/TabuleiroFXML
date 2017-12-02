// Decompiled by DJ v3.12.12.101 Copyright 2016 Atanas Neshkov  Date: 30/11/2017 19:28:23
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Cajahyba.java
package Tabuleiro;

import java.util.ArrayList;
import javafx.scene.image.ImageView;

// Referenced classes of package jogotabuleirofxml:
//            Peça
public class Cajahyba extends Peça {

    private void setCor(int cor) {
        Cor = cor;
    }

    public int getCor() {
        return Cor;
    }

    private void setX(int x) {
        X = x;
    }

    public int getX() {
        return X;
    }

    private void setY(int y) {
        Y = y;
    }

    public int getY() {
        return Y;
    }

    public Cajahyba(int cor, int x, int y) {
        setCor(cor);
        setX(x);
        setY(y);
        
        Ícone = new ImageView("png/C++.png");
        
        Ícone.setFitHeight(TamCasa);
        Ícone.setFitWidth(TamCasa);
        
        if (Cor == 0) {
            Formato = 'c';
        } else {
            Formato = 'C';
        }
    }
    
    public ArrayList TraçarCaminhos(int NovoX, int NovoY) {
        ArrayList Caminho = new ArrayList();
        if (X - 2 == NovoX && Y == NovoY) {
            
            Caminho.add(X);
            Caminho.add(Y + 1);
            
            Caminho.add(X - 1);
            Caminho.add(Y + 1);
            
            Caminho.add(X - 2);
            Caminho.add(Y + 1);
            
            Caminho.add(X - 2);
            Caminho.add(Y);
        } else if (X + 2 == NovoX && Y == NovoY) {
            
            Caminho.add(X);
            Caminho.add(Y - 1);
            
            Caminho.add(X + 1);
            Caminho.add(Y - 1);
            
            Caminho.add(X + 2);
            Caminho.add(Y - 1);
            
            Caminho.add(X + 2);
            Caminho.add(Y);
        } else if (X == NovoX && Y - 2 == NovoY) {
            Caminho.add(X - 1);
            Caminho.add(Y);
            
            Caminho.add(X - 1);
            Caminho.add(Y - 1);
            
            Caminho.add(X - 1);
            Caminho.add(Y - 2);
            
            Caminho.add(X);
            Caminho.add(Y - 2);
        } else if (X == NovoX && Y + 2 == NovoY) {
            
            Caminho.add(X + 1);
            Caminho.add(Y);
            
            Caminho.add(X + 1);
            Caminho.add(Y + 1);
            
            Caminho.add(X + 1);
            Caminho.add(Y + 2);
            
            Caminho.add(X);
            Caminho.add(Y + 2);
        } else {
            
            return null;
        }
        
        return Caminho;
    }

    public ArrayList TraçarCaptura(int NovoX, int NovoY) {
        
        ArrayList Captura = new ArrayList();
        
        if (X - 1 == NovoX && Y == NovoY) {
            
            Captura.add(X - 1);
            Captura.add(Y);
        } else if (X == NovoX && Y - 1 == NovoY) {
            
            Captura.add(X);
            Captura.add(Y - 1);
        } else if (X + 1 == NovoX && Y == NovoY) {
            
            Captura.add(X + 1);
            Captura.add(Y);
        } else if (X == NovoX && Y + 1 == NovoY) {
            
            Captura.add(X);
            Captura.add(Y + 1);
        } else {
            
            return null;
        }
        
        return Captura;
    }
}