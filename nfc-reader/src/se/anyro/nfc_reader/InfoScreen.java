package se.anyro.nfc_reader;

import java.util.Locale;

import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Intent;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.os.Bundle;

public class InfoScreen extends TagViewer {
	
	public String firstname;
	public String lastname;
	public String id;
	
//	private void ctor(String id) {
//		// GetData(id);
//		this.firstname = "";
//		this.lastname = "";
//		this.id = id;
//	}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
//        resolveIntent(getIntent());
//
//        mDialog = new AlertDialog.Builder(this).setNeutralButton("Ok", null).create();
//
//        mAdapter = NfcAdapter.getDefaultAdapter(this);
//        if (mAdapter == null) {
//            showMessage(R.string.error, R.string.no_nfc);
//            finish();
//            return;
//        }
//
//        mPendingIntent = PendingIntent.getActivity(this, 0,
//                new Intent(this, getClass()).addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP), 0);
//        mNdefPushMessage = new NdefMessage(new NdefRecord[] { newTextRecord(
//                "Message from NFC Reader :-)", Locale.ENGLISH, true) });
    }
	
}
