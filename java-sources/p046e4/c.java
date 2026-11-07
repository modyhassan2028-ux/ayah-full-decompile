package p046e4;

import K9.AbstractC0405x;
import K9.H;
import K9.InterfaceC0402u;
import R9.d;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import p110k9.y;
import p161p9.a;
import p241y9.e;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15761r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f15762s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f15763t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15764u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f15765v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f15766w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f15767x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15768y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Context context, int i10, int i11, int i12, String str, ArrayList arrayList, p150o9.c cVar) {
        super(2, cVar);
        this.f15762s = eVar;
        this.f15763t = context;
        this.f15764u = i10;
        this.f15765v = i11;
        this.f15766w = i12;
        this.f15767x = str;
        this.f15768y = arrayList;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        return new c(this.f15762s, this.f15763t, this.f15764u, this.f15765v, this.f15766w, this.f15767x, this.f15768y, cVar);
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        c cVar;
        int i10 = this.f15761r;
        Context context = this.f15763t;
        e eVar = this.f15762s;
        a aVar = a.f21156r;
        if (i10 == 0) {
            p110k9.a.e(obj);
            p057f4.c cVar2 = eVar.f15782a;
            this.f15761r = 1;
            obj = p057f4.c.a(cVar2, context, this.f15764u, this.f15765v, this.f15766w, false, this, 64);
            cVar = this;
            if (obj != aVar) {
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(obj);
            return obj;
        }
        p110k9.a.e(obj);
        cVar = this;
        Bitmap bitmap = (Bitmap) obj;
        cVar.f15761r = 2;
        a aVar2 = b.f15760a;
        R9.e eVar2 = H.f5322a;
        Object objI = AbstractC0405x.I(d.f7436t, new d(eVar, context, cVar.f15767x, cVar.f15768y, aVar2, bitmap, null), this);
        return objI == aVar ? aVar : objI;
    }
}
