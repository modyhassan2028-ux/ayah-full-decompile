package J1;

import E6.u;
import I1.B0;
import I1.r;
import Q8.Q;
import Q8.S;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.contentcapture.ContentCaptureSession;
import com.ayah.feature.reciterlist.qari.QariAudioActivity;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import io.realm.internal.ObjectServerFacade;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements p100j8.c, L6.g, r, B6.d, W2.o {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4195r;

    public /* synthetic */ c(int i10) {
        this.f4195r = i10;
    }

    public static /* bridge */ /* synthetic */ AutofillId d(Object obj) {
        return (AutofillId) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillManager e(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession f(Object obj) {
        return (ContentCaptureSession) obj;
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return AutofillManager.class;
    }

    @Override // L6.g, B6.d
    public Object apply(Object obj) {
        switch (this.f4195r) {
            case 10:
                Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursorRawQuery.moveToNext()) {
                        android.support.v4.media.session.r rVarA = E6.j.a();
                        rVarA.N(cursorRawQuery.getString(1));
                        rVarA.f11366u = O6.a.b(cursorRawQuery.getInt(2));
                        String string = cursorRawQuery.getString(3);
                        rVarA.f11365t = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(rVarA.x());
                        break;
                    }
                    return arrayList;
                } finally {
                    cursorRawQuery.close();
                }
            default:
                String strD = S.f6913b.D((Q) obj);
                p251z9.j.d(strD, "encode(...)");
                Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
                byte[] bytes = strD.getBytes(H9.a.f3610a);
                p251z9.j.d(bytes, "getBytes(...)");
                return bytes;
        }
    }

    @Override // W2.o
    public void b(W2.m mVar, W2.p pVar, boolean z10) {
        switch (this.f4195r) {
            case 26:
                mVar.f(pVar);
                break;
            case 27:
                mVar.g(pVar);
                break;
            case 28:
                mVar.a(pVar);
                break;
            default:
                mVar.b();
                break;
        }
    }

    @Override // p100j8.c
    public Object c(u uVar) {
        switch (this.f4195r) {
            case 4:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(uVar);
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                Set setB = uVar.B(O8.a.class);
                O8.c cVar = O8.c.f6510s;
                if (cVar == null) {
                    synchronized (O8.c.class) {
                        try {
                            cVar = O8.c.f6510s;
                            if (cVar == null) {
                                cVar = new O8.c(0);
                                O8.c.f6510s = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return new O8.b(setB, cVar);
            case 22:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(uVar);
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(uVar);
        }
    }

    @Override // I1.r
    public B0 p(View view, B0 b5) {
        switch (this.f4195r) {
            case 11:
                int i10 = QariAudioActivity.f13858a0;
                p251z9.j.e(view, "v");
                A1.c cVarG = b5.f3671a.g(519);
                p251z9.j.d(cVarG, "getInsets(...)");
                view.setPadding(0, cVarG.f463b, 0, 0);
                break;
            default:
                int i11 = QariAudioActivity.f13858a0;
                p251z9.j.e(view, "v");
                A1.c cVarG2 = b5.f3671a.g(647);
                p251z9.j.d(cVarG2, "getInsets(...)");
                view.setPadding(cVarG2.f462a, 0, cVarG2.f464c, cVarG2.f465d);
                break;
        }
        return b5;
    }
}
