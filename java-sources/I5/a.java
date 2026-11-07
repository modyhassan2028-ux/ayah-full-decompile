package I5;

import J3.x;
import P5.g;
import Z0.B;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import com.ayah.AyahImportActivity;
import com.ayah.Hilt_AyahImportActivity;
import com.ayah.Hilt_MainActivity;
import com.ayah.MainActivity;
import com.ayah.PreferencesActivity;
import com.ayah.feature.reciterlist.Hilt_RecitersActivity;
import com.ayah.feature.reciterlist.RecitersActivity;
import com.ayah.feature.reciterlist.qari.Hilt_QariAudioActivity;
import com.ayah.feature.reciterlist.qari.QariAudioActivity;
import com.ayah.feature.reminder.Hilt_ReminderSettingsActivity;
import com.ayah.feature.reminder.ReminderSettingsActivity;
import com.ayah.note.Hilt_NoteActivity;
import com.ayah.note.NoteActivity;
import com.ayah.share.Hilt_ShareActivity;
import com.ayah.share.ShareActivity;
import p035d3.H;
import p035d3.I;
import p035d3.j;
import p035d3.l;
import p035d3.u;
import p074h0.i;
import p084i.k;
import p144o3.e;
import p144o3.h;
import p218w3.f;
import p218w3.n;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p041e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f3847b;

    public /* synthetic */ a(AppCompatActivity appCompatActivity, int i10) {
        this.f3846a = i10;
        this.f3847b = appCompatActivity;
    }

    @Override // p041e.a
    public final void a(ComponentActivity componentActivity) {
        switch (this.f3846a) {
            case 0:
                Hilt_RecitersActivity hilt_RecitersActivity = (Hilt_RecitersActivity) this.f3847b;
                if (!hilt_RecitersActivity.f13852V) {
                    hilt_RecitersActivity.f13852V = true;
                    u uVar = ((l) ((c) hilt_RecitersActivity.c())).f15618b;
                    ((RecitersActivity) hilt_RecitersActivity).f13856Y = new L5.c((f) uVar.f15680x.get(), (h) uVar.f15675s.get());
                }
                break;
            case 1:
                Hilt_QariAudioActivity hilt_QariAudioActivity = (Hilt_QariAudioActivity) this.f3847b;
                if (!hilt_QariAudioActivity.f13857V) {
                    hilt_QariAudioActivity.f13857V = true;
                    ((QariAudioActivity) hilt_QariAudioActivity).f13862Z = (g) ((l) ((M5.a) hilt_QariAudioActivity.c())).f15619c.f15630e.get();
                }
                break;
            case 2:
                Hilt_ReminderSettingsActivity hilt_ReminderSettingsActivity = (Hilt_ReminderSettingsActivity) this.f3847b;
                if (!hilt_ReminderSettingsActivity.f13863V) {
                    hilt_ReminderSettingsActivity.f13863V = true;
                    u uVar2 = ((l) ((S5.c) hilt_ReminderSettingsActivity.c())).f15618b;
                    ((ReminderSettingsActivity) hilt_ReminderSettingsActivity).f13867Y = new L5.c((p208v3.c) uVar2.f15663e.get(), (p227x3.a) uVar2.f15648G.get());
                }
                break;
            case 3:
                Hilt_AyahImportActivity hilt_AyahImportActivity = (Hilt_AyahImportActivity) this.f3847b;
                if (!hilt_AyahImportActivity.f13620V) {
                    hilt_AyahImportActivity.f13620V = true;
                    ((AyahImportActivity) hilt_AyahImportActivity).f13612W = (p166q4.a) ((l) ((j) hilt_AyahImportActivity.c())).f15618b.f15668l.get();
                }
                break;
            case 4:
                Hilt_MainActivity hilt_MainActivity = (Hilt_MainActivity) this.f3847b;
                if (!hilt_MainActivity.f13621V) {
                    hilt_MainActivity.f13621V = true;
                    H h7 = (H) hilt_MainActivity.c();
                    MainActivity mainActivity = (MainActivity) hilt_MainActivity;
                    l lVar = (l) h7;
                    u uVar3 = lVar.f15618b;
                    mainActivity.f13658w0 = (e) uVar3.f15682z.get();
                    mainActivity.f13659x0 = (p218w3.c) uVar3.f15642A.get();
                    mainActivity.f13660y0 = (n) lVar.f15619c.f15629d.get();
                    mainActivity.f13661z0 = (p218w3.h) uVar3.f15643B.get();
                    mainActivity.f13623A0 = (p218w3.a) uVar3.f15644C.get();
                    mainActivity.f13624B0 = (p025c4.a) uVar3.f15645D.get();
                    mainActivity.f13625C0 = (p236y3.a) uVar3.f15646E.get();
                    mainActivity.f13626D0 = (p144o3.a) uVar3.f15647F.get();
                    mainActivity.f13627E0 = (p227x3.a) uVar3.f15648G.get();
                    mainActivity.f13628F0 = (x) uVar3.f15666i.get();
                    mainActivity.f13629G0 = (p166q4.a) uVar3.f15668l.get();
                }
                break;
            case 5:
                PreferencesActivity preferencesActivity = (PreferencesActivity) this.f3847b;
                if (!preferencesActivity.f15686V) {
                    preferencesActivity.f15686V = true;
                    preferencesActivity.f13669c0 = (p166q4.c) ((l) ((I) preferencesActivity.c())).f15618b.f15650I.get();
                }
                break;
            case 6:
                AppCompatActivity appCompatActivity = this.f3847b;
                k kVarO = appCompatActivity.o();
                kVarO.a();
                ((L5.c) appCompatActivity.f11380u.f5533t).m("androidx:appcompat");
                kVarO.d();
                break;
            case 7:
                Hilt_NoteActivity hilt_NoteActivity = (Hilt_NoteActivity) this.f3847b;
                if (!hilt_NoteActivity.f13905V) {
                    hilt_NoteActivity.f13905V = true;
                    ((NoteActivity) hilt_NoteActivity).f13918h0 = new i(u.a(), (p198u3.f) ((l) ((p098j6.c) hilt_NoteActivity.c())).f15618b.f15652K.get());
                }
                break;
            default:
                Hilt_ShareActivity hilt_ShareActivity = (Hilt_ShareActivity) this.f3847b;
                if (!hilt_ShareActivity.f13919V) {
                    hilt_ShareActivity.f13919V = true;
                    p127m6.e eVar = (p127m6.e) hilt_ShareActivity.c();
                    ShareActivity shareActivity = (ShareActivity) hilt_ShareActivity;
                    l lVar2 = (l) eVar;
                    shareActivity.f13931g0 = lVar2.a();
                    shareActivity.f13932h0 = new B((p218w3.j) lVar2.f15618b.f15681y.get());
                }
                break;
        }
    }
}
