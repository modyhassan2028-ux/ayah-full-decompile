package C2;

import A.C0045t0;
import android.content.Intent;
import android.content.IntentSender;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f688r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f689s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f690t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f691u;

    public /* synthetic */ b(int i10, int i11, Object obj, Object obj2) {
        this.f688r = i11;
        this.f690t = obj;
        this.f689s = i10;
        this.f691u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f688r) {
            case 0:
                ((d) ((C0045t0) this.f690t).f418c).h(this.f689s, this.f691u);
                break;
            case 1:
                p020c.i iVar = (p020c.i) this.f690t;
                Serializable serializable = (Serializable) ((X4.c) this.f691u).f9953r;
                String str = (String) iVar.f13382a.get(Integer.valueOf(this.f689s));
                if (str != null) {
                    p053f.d dVar = (p053f.d) iVar.f13386e.get(str);
                    if ((dVar != null ? dVar.f15875a : null) != null) {
                        p053f.b bVar = dVar.f15875a;
                        if (iVar.f13385d.remove(str)) {
                            bVar.d(serializable);
                        }
                    } else {
                        iVar.g.remove(str);
                        iVar.f13387f.put(str, serializable);
                    }
                    break;
                }
                break;
            default:
                ((p020c.i) this.f690t).a(this.f689s, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f691u));
                break;
        }
    }
}
