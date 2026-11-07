package W6;

import R6.e;
import T6.i;
import U6.AbstractC0527e;
import U6.J;
import U6.m;
import U6.y;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.support.v4.media.session.r;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC0527e implements S6.a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Set f9643y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final m f9644z;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(Context context, Looper looper, r rVar, m mVar, i iVar, i iVar2) {
        J jA = J.a(context);
        e eVar = e.f7244d;
        y.f(iVar);
        y.f(iVar2);
        super(context, looper, jA, eVar, 270, new U6.r(iVar), new U6.r(iVar2), (String) rVar.f11365t);
        Set set = (Set) rVar.f11364s;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f9643y = set;
        this.f9644z = mVar;
    }

    @Override // S6.a
    public final Set c() {
        return m() ? this.f9643y : Collections.EMPTY_SET;
    }

    @Override // U6.AbstractC0527e, S6.a
    public final int f() {
        return 203400000;
    }

    @Override // U6.AbstractC0527e
    public final IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 1);
    }

    @Override // U6.AbstractC0527e
    public final Account q() {
        return null;
    }

    @Override // U6.AbstractC0527e
    public final R6.d[] r() {
        return p038d7.c.f15702b;
    }

    @Override // U6.AbstractC0527e
    public final Bundle s() {
        m mVar = this.f9644z;
        mVar.getClass();
        Bundle bundle = new Bundle();
        String str = mVar.f8292a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // U6.AbstractC0527e
    public final Set t() {
        return this.f9643y;
    }

    @Override // U6.AbstractC0527e
    public final String v() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // U6.AbstractC0527e
    public final String w() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // U6.AbstractC0527e
    public final boolean x() {
        return true;
    }
}
