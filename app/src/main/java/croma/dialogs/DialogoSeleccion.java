package croma.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.util.Log;

/**
 * Created by upam on 02/03/17.
 */

public class DialogoSeleccion extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final String[] items = {"oye", "te ", "Amo","Yoali"};

        AlertDialog.Builder builder =
                new AlertDialog.Builder(getActivity());

        builder.setTitle("Selección")
                ./*setSingleChoiceItems(items, -1,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int item) {
                                Log.i("Dialogos", "Opción elegida: " + items[item]);
                            }
                        });*/setMultiChoiceItems(items, null,
                        new DialogInterface.OnMultiChoiceClickListener() {
                            public void onClick(DialogInterface dialog, int item, boolean isChecked) {
                                Log.i("Dialogos", "Opción elegida: " + items[item]);
                            }
                        });/*setItems(items, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int item) {
                        Log.i("Dialogos", "Opción elegida: " + items[item]);
                    }
                });*/

        return builder.create();
    }
}
