package androidx.fragment.app;

import K0.C0368s0;
import X4.c;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.EnumC0766o;
import androidx.lifecycle.EnumC0767p;
import androidx.lifecycle.w;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p020c.C0780e;
import p056f2.AbstractComponentCallbacksC0947u;
import p056f2.C0948v;
import p056f2.C0949w;
import p056f2.K;
import p056f2.L;
import p056f2.U;
import p216w1.a;
import p251z9.e;
import p251z9.j;
import u.P;

/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements a {
    public static final /* synthetic */ int Q = 0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f12593N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f12594O;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final c f12591L = new c(new C0949w(this));

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final w f12592M = new w(this);

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f12595P = true;

    public FragmentActivity() {
        ((L5.c) this.f11380u.f5533t).L("android:support:lifecycle", new C0368s0(2, this));
        j(new C0948v(0, this));
        this.f11370C.add(new C0948v(1, this));
        k(new C0780e(this, 1));
    }

    public static boolean n(K k7) {
        boolean zN = false;
        for (AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u : k7.f15964c.v()) {
            if (abstractComponentCallbacksC0947u != null) {
                C0949w c0949w = abstractComponentCallbacksC0947u.f16138L;
                if ((c0949w == null ? null : c0949w.f16176v) != null) {
                    zN |= n(abstractComponentCallbacksC0947u.k());
                }
                U u8 = abstractComponentCallbacksC0947u.f16155h0;
                EnumC0767p enumC0767p = EnumC0767p.f12664u;
                EnumC0767p enumC0767p2 = EnumC0767p.f12663t;
                if (u8 != null) {
                    u8.d();
                    if (u8.f16033v.f12672c.compareTo(enumC0767p) >= 0) {
                        abstractComponentCallbacksC0947u.f16155h0.f16033v.g(enumC0767p2);
                        zN = true;
                    }
                }
                if (abstractComponentCallbacksC0947u.f16154g0.f12672c.compareTo(enumC0767p) >= 0) {
                    abstractComponentCallbacksC0947u.f16154g0.g(enumC0767p2);
                    zN = true;
                }
            }
        }
        return zN;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return;
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            return;
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            return;
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                        return;
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.f12593N);
        printWriter.print(" mResumed=");
        printWriter.print(this.f12594O);
        printWriter.print(" mStopped=");
        printWriter.print(this.f12595P);
        if (getApplication() != null) {
            androidx.lifecycle.U uG = g();
            j.e(uG, "store");
            p105k2.a aVar = p105k2.a.f18957b;
            j.e(aVar, "defaultCreationExtras");
            Aa.a aVar2 = new Aa.a(uG, p133n2.a.f19981c, aVar);
            e eVarA = p251z9.w.a(p133n2.a.class);
            String strB = eVarA.b();
            if (strB == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            P p10 = ((p133n2.a) aVar2.x("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB), eVarA)).f19982b;
            if (p10.g() > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (p10.g() > 0) {
                    if (p10.h(0) != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(p10.e(0));
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((C0949w) this.f12591L.f9953r).f16175u.w(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.f12591L.l();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12592M.d(EnumC0766o.ON_CREATE);
        L l10 = ((C0949w) this.f12591L.f9953r).f16175u;
        l10.f15953H = false;
        l10.f15954I = false;
        l10.f15960O.g = false;
        l10.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((C0949w) this.f12591L.f9953r).f16175u.f15967f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((C0949w) this.f12591L.f9953r).f16175u.l();
        this.f12592M.d(EnumC0766o.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return ((C0949w) this.f12591L.f9953r).f16175u.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f12594O = false;
        ((C0949w) this.f12591L.f9953r).f16175u.u(5);
        this.f12592M.d(EnumC0766o.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f12592M.d(EnumC0766o.ON_RESUME);
        L l10 = ((C0949w) this.f12591L.f9953r).f16175u;
        l10.f15953H = false;
        l10.f15954I = false;
        l10.f15960O.g = false;
        l10.u(7);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f12591L.l();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        c cVar = this.f12591L;
        cVar.l();
        super.onResume();
        this.f12594O = true;
        ((C0949w) cVar.f9953r).f16175u.A(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        c cVar = this.f12591L;
        cVar.l();
        C0949w c0949w = (C0949w) cVar.f9953r;
        super.onStart();
        this.f12595P = false;
        if (!this.f12593N) {
            this.f12593N = true;
            L l10 = c0949w.f16175u;
            l10.f15953H = false;
            l10.f15954I = false;
            l10.f15960O.g = false;
            l10.u(4);
        }
        c0949w.f16175u.A(true);
        this.f12592M.d(EnumC0766o.ON_START);
        L l11 = c0949w.f16175u;
        l11.f15953H = false;
        l11.f15954I = false;
        l11.f15960O.g = false;
        l11.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f12591L.l();
    }

    @Override // android.app.Activity
    public void onStop() {
        c cVar;
        super.onStop();
        this.f12595P = true;
        do {
            cVar = this.f12591L;
        } while (n(((C0949w) cVar.f9953r).f16175u));
        L l10 = ((C0949w) cVar.f9953r).f16175u;
        l10.f15954I = true;
        l10.f15960O.g = true;
        l10.u(4);
        this.f12592M.d(EnumC0766o.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((C0949w) this.f12591L.f9953r).f16175u.f15967f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }
}
