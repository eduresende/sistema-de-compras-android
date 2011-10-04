package com.sistemadecompras;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class AppCompra extends Activity {

	CheckBox chkarroz, chkleite, chkcarne, chkfeijao;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		chkarroz = (CheckBox) findViewById(R.id.chkarroz);
		chkleite = (CheckBox) findViewById(R.id.chkleite);
		chkcarne = (CheckBox) findViewById(R.id.chkcarne);
		chkfeijao = (CheckBox) findViewById(R.id.chkfeijao);

		Button btotal = (Button) findViewById(R.id.btotal);
		btotal.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				double total = 0;

				if (chkarroz.isChecked())
					total += 2.69;
				if (chkleite.isChecked())
					total += 5.00;
				if (chkcarne.isChecked())
					total += 9.7;
				if (chkfeijao.isChecked())
					total += 2.3;

				AlertDialog.Builder dialogo = new AlertDialog.Builder(
						AppCompra.this);
				dialogo.setTitle("Aviso");
				dialogo.setMessage("Valor total da compra: "
						+ String.valueOf(total));
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
			}
		});
	}
}