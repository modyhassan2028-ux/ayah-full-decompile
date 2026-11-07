package i7;

import E2.RunnableC0147v;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: i7.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0973d0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q1 f17319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17321c;

    public C0973d0(Q1 q10) {
        U6.y.f(q10);
        this.f17319a = q10;
    }

    public final void a() {
        Q1 q10 = this.f17319a;
        q10.l0();
        q10.c().o();
        q10.c().o();
        if (this.f17320b) {
            q10.b().f17178E.a("Unregistering connectivity change receiver");
            this.f17320b = false;
            this.f17321c = false;
            try {
                q10.f17084C.f17579r.unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                q10.b().f17182w.b(e10, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Q1 q10 = this.f17319a;
        q10.l0();
        String action = intent.getAction();
        q10.b().f17178E.b(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            q10.b().f17185z.b(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        C0967b0 c0967b0 = q10.f17105s;
        Q1.U(c0967b0);
        boolean zI = c0967b0.I();
        if (this.f17321c != zI) {
            this.f17321c = zI;
            q10.c().x(new RunnableC0147v(this, zI));
        }
    }
}
