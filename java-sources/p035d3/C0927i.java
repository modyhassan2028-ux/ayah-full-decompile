package p035d3;

import K9.AbstractC0405x;
import K9.H;
import K9.InterfaceC0402u;
import R9.d;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.ayah.AyahImportActivity;
import com.ayah.MainActivity;
import p110k9.y;
import p147o6.b;
import p150o9.c;
import p161p9.a;
import p241y9.e;
import p251z9.j;
import q9.i;

/* JADX INFO: renamed from: d3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0927i extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15610r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15611s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AyahImportActivity f15612t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Uri f15613u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0927i(AyahImportActivity ayahImportActivity, Uri uri, c cVar, int i10) {
        super(2, cVar);
        this.f15610r = i10;
        this.f15612t = ayahImportActivity;
        this.f15613u = uri;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        switch (this.f15610r) {
            case 0:
                return new C0927i(this.f15612t, this.f15613u, cVar, 0);
            default:
                return new C0927i(this.f15612t, this.f15613u, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        c cVar = (c) obj2;
        switch (this.f15610r) {
            case 0:
                break;
        }
        return ((C0927i) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f15610r;
        c cVar = null;
        Uri uri = this.f15613u;
        a aVar = a.f21156r;
        AyahImportActivity ayahImportActivity = this.f15612t;
        switch (i10) {
            case 0:
                int i11 = this.f15611s;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return obj;
                }
                p110k9.a.e(obj);
                Context applicationContext = ayahImportActivity.getApplicationContext();
                j.d(applicationContext, "getApplicationContext(...)");
                p166q4.a aVar2 = ayahImportActivity.f13612W;
                if (aVar2 == null) {
                    j.k("crashLogger");
                    throw null;
                }
                this.f15611s = 1;
                R9.e eVar = H.f5322a;
                Object objI = AbstractC0405x.I(d.f7436t, new b(applicationContext, uri, aVar2, null), this);
                return objI == aVar ? aVar : objI;
            default:
                int i12 = this.f15611s;
                int i13 = 0;
                if (i12 == 0) {
                    p110k9.a.e(obj);
                    R9.e eVar2 = H.f5322a;
                    d dVar = d.f7436t;
                    C0927i c0927i = new C0927i(ayahImportActivity, uri, cVar, i13);
                    this.f15611s = 1;
                    obj = AbstractC0405x.I(dVar, c0927i, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i14 = AyahImportActivity.f13611c0;
                ayahImportActivity.s();
                ayahImportActivity.f13616a0 = false;
                if (zBooleanValue) {
                    ayahImportActivity.finish();
                    Intent intent = new Intent(ayahImportActivity, (Class<?>) MainActivity.class);
                    intent.setFlags(67108864);
                    ayahImportActivity.startActivity(intent);
                } else {
                    ayahImportActivity.t();
                }
                return y.f19095a;
        }
    }
}
