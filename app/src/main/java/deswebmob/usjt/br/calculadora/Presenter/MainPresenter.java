package deswebmob.usjt.br.calculadora.Presenter;

import deswebmob.usjt.br.calculadora.Model.Calculadora;
import deswebmob.usjt.br.calculadora.View.MainView;

/**
 * Created by arqdsis on 02/05/2018.
 */

public class MainPresenter implements Presenter {
    private Calculadora model;
    private MainView view;


    public MainPresenter(MainView view){
        this.view=view;


    }

    @Override
    public void onCreate() {
        model = new Calculadora();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void onRestart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onStop() {

    }

    public  void calculo(){
        model.setValor1(view.getValor1());
        model.setValor2(view.getValor1());
        model.setOperador(view.getOperador());
        model.calculo();
        view.setResultado(model.getResultado());

    }
}
