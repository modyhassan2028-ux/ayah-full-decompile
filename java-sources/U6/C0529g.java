package U6;

import E2.O;
import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: renamed from: U6.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0529g extends V6.a {
    public static final Parcelable.Creator<C0529g> CREATOR = new O(18);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final Scope[] f8253F = new Scope[0];

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final R6.d[] f8254G = new R6.d[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public R6.d[] f8255A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f8256B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f8257C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f8258D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final String f8259E;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f8260r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8261s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f8262t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f8263u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public IBinder f8264v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Scope[] f8265w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Bundle f8266x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Account f8267y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public R6.d[] f8268z;

    public C0529g(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, R6.d[] dVarArr, R6.d[] dVarArr2, boolean z10, int i13, boolean z11, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? f8253F : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        R6.d[] dVarArr3 = f8254G;
        R6.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f8260r = i10;
        this.f8261s = i11;
        this.f8262t = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f8263u = "com.google.android.gms";
        } else {
            this.f8263u = str;
        }
        if (i10 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i14 = AbstractBinderC0523a.g;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface l10 = iInterfaceQueryLocalInterface instanceof InterfaceC0530h ? (InterfaceC0530h) iInterfaceQueryLocalInterface : new L(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        L l11 = (L) l10;
                        Parcel parcelA = l11.a(l11.g(), 2);
                        Account account3 = (Account) p049e7.a.a(parcelA, Account.CREATOR);
                        parcelA.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            }
            this.f8267y = account2;
        } else {
            this.f8264v = iBinder;
            this.f8267y = account;
        }
        this.f8265w = scopeArr2;
        this.f8266x = bundle2;
        this.f8268z = dVarArr4;
        this.f8255A = dVarArr3;
        this.f8256B = z10;
        this.f8257C = i13;
        this.f8258D = z11;
        this.f8259E = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        O.a(this, parcel, i10);
    }
}
