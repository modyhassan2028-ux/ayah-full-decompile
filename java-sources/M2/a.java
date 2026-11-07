package M2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.Arrays;
import java.util.LinkedHashSet;
import p110k9.j;
import p120l9.m;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5671b;

    public a(L5.c cVar) {
        this.f5670a = 0;
        this.f5671b = new LinkedHashSet();
        cVar.L("androidx.savedstate.Restarter", this);
    }

    @Override // M2.d
    public final Bundle a() {
        switch (this.f5670a) {
            case 0:
                Bundle bundleP = AbstractC0813f2.p((j[]) Arrays.copyOf(new j[0], 0));
                Y2.a.d0(bundleP, "classes_to_restore", m.C0((LinkedHashSet) this.f5671b));
                return bundleP;
            default:
                Bundle bundle = new Bundle();
                ((AppCompatActivity) this.f5671b).o().getClass();
                return bundle;
        }
    }

    public a(AppCompatActivity appCompatActivity) {
        this.f5670a = 1;
        this.f5671b = appCompatActivity;
    }
}
