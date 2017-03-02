package croma.dialogs;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by upam on 02/03/17.
 */

public class DialogoAlerta extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder =
                new AlertDialog.Builder(getActivity());

        builder.setMessage("oye me encatas presiona ok y yo igual ye encanto.")
                .setTitle("Información")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                }).setNeutralButton("Neutral",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int whish){
                //Toast.makeText(this,"Ok neutral",Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }

        }).setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                //Log.i("Dialogos", "Confirmacion Cancelada.");
                dialog.cancel();
            }
        });

        return builder.create();

    }


}
