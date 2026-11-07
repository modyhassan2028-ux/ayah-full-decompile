package P5;

import A.C0039q;
import K9.AbstractC0405x;
import K9.H;
import K9.InterfaceC0402u;
import java.util.Arrays;
import java.util.Locale;
import p110k9.y;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6680r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6681s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f6682t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p065g3.a f6683u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f6684v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f6685w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p065g3.a aVar, String str, int i10, g gVar, p150o9.c cVar) {
        super(2, cVar);
        this.f6683u = aVar;
        this.f6682t = str;
        this.f6684v = i10;
        this.f6685w = gVar;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f6680r) {
            case 0:
                return new a(this.f6683u, this.f6682t, this.f6684v, this.f6685w, cVar);
            default:
                return new a(this.f6682t, this.f6683u, this.f6684v, this.f6685w, cVar);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f6680r) {
            case 0:
                break;
        }
        return ((a) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f6680r;
        y yVar = y.f19095a;
        p161p9.a aVar = p161p9.a.f21156r;
        switch (i10) {
            case 0:
                int i11 = this.f6681s;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                R9.e eVar = H.f5322a;
                R9.d dVar = R9.d.f7436t;
                C0039q c0039q = new C0039q(this.f6683u, this.f6682t, this.f6684v, this.f6685w, null, 21);
                this.f6681s = 1;
                return AbstractC0405x.I(dVar, c0039q, this) == aVar ? aVar : yVar;
            default:
                int i12 = this.f6681s;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                int i13 = this.f6684v;
                p065g3.a aVar2 = this.f6683u;
                p155p3.b bVar = new p155p3.b(i13, aVar2, this.f6682t);
                String str = String.format(Locale.US, "%03d-%d.mp3", Arrays.copyOf(new Object[]{Integer.valueOf(i13), Integer.valueOf(((p065g3.c) aVar2.f16281k.get(i13 - 1)).f16287d)}, 2));
                i6.e eVar2 = new i6.e(bVar, "https://audio.ayah.app/" + aVar2.f16273a + "/" + str);
                g gVar = this.f6685w;
                g.a(gVar, aVar2, i13, eVar2);
                M9.e eVar3 = gVar.f6710i;
                this.f6681s = 1;
                return eVar3.d(bVar, this) == aVar ? aVar : yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, p065g3.a aVar, int i10, g gVar, p150o9.c cVar) {
        super(2, cVar);
        this.f6682t = str;
        this.f6683u = aVar;
        this.f6684v = i10;
        this.f6685w = gVar;
    }
}
