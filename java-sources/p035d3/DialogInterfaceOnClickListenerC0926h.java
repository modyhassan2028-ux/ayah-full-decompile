package p035d3;

import K9.AbstractC0405x;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.ayah.AyahImportActivity;
import com.ayah.MainActivity;
import com.ayah.note.NoteActivity;
import p098j6.b;
import p251z9.j;

/* JADX INFO: renamed from: d3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0926h implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15608r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f15609s;

    public /* synthetic */ DialogInterfaceOnClickListenerC0926h(AppCompatActivity appCompatActivity, int i10) {
        this.f15608r = i10;
        this.f15609s = appCompatActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = this.f15608r;
        AppCompatActivity appCompatActivity = this.f15609s;
        switch (i11) {
            case 0:
                AyahImportActivity ayahImportActivity = (AyahImportActivity) appCompatActivity;
                int i12 = AyahImportActivity.f13611c0;
                ayahImportActivity.s();
                ayahImportActivity.u();
                break;
            case 1:
                AyahImportActivity ayahImportActivity2 = (AyahImportActivity) appCompatActivity;
                int i13 = AyahImportActivity.f13611c0;
                ayahImportActivity2.s();
                ayahImportActivity2.finish();
                break;
            case 2:
                AyahImportActivity ayahImportActivity3 = (AyahImportActivity) appCompatActivity;
                int i14 = AyahImportActivity.f13611c0;
                ayahImportActivity3.s();
                ayahImportActivity3.finish();
                Intent intent = new Intent(ayahImportActivity3, (Class<?>) MainActivity.class);
                intent.setFlags(67108864);
                ayahImportActivity3.startActivity(intent);
                break;
            default:
                NoteActivity noteActivity = (NoteActivity) appCompatActivity;
                int i15 = NoteActivity.f13906i0;
                j.e(dialogInterface, "d");
                dialogInterface.dismiss();
                if (noteActivity.f13911a0) {
                    AbstractC0405x.x(noteActivity.f13907W, null, new b(noteActivity, null, 2), 3);
                }
                noteActivity.finish();
                break;
        }
    }
}
