package es.cic.taller.ejercicioNoSe2;

import com.vaadin.ui.FormLayout;
import com.vaadin.ui.TextField;

public class TapeteFrom extends FormLayout	{

	
	
	private MyUI myUi;
	private int i=1;
	
	public TapeteFrom(MyUI myUi) {
	this.myUi=myUi;
	for (int j=0;j<4;j++) {
	TextField carta = new TextField();	
	carta.setCaption("carta"+i);
	i++;
	addComponents(carta);
	}
	}
}
