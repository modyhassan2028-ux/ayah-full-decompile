package p035d3;

import J3.x;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import N9.AbstractC0419l;
import N9.InterfaceC0415h;
import android.content.Intent;
import com.ayah.MainActivity;
import com.ayah.feature.audio.service.AyahAudioService;
import p017b7.g;
import p110k9.y;
import p150o9.c;
import p161p9.a;
import p241y9.e;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class G extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15590r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15591s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ MainActivity f15592t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(MainActivity mainActivity, c cVar, int i10) {
        super(2, cVar);
        this.f15590r = i10;
        this.f15592t = mainActivity;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        switch (this.f15590r) {
            case 0:
                return new G(this.f15592t, cVar, 0);
            default:
                return new G(this.f15592t, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        c cVar = (c) obj2;
        switch (this.f15590r) {
            case 0:
                break;
        }
        return ((G) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f15590r;
        MainActivity mainActivity = this.f15592t;
        a aVar = a.f21156r;
        switch (i10) {
            case 0:
                int i11 = this.f15591s;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return obj;
                }
                p110k9.a.e(obj);
                x xVar = mainActivity.f13628F0;
                if (xVar == null) {
                    j.k("preferencesStore");
                    throw null;
                }
                InterfaceC0415h interfaceC0415h = xVar.g;
                this.f15591s = 1;
                Object objP = AbstractC0419l.p(interfaceC0415h, this);
                return objP == aVar ? aVar : objP;
            default:
                int i12 = this.f15591s;
                y yVar = y.f19095a;
                if (i12 == 0) {
                    p110k9.a.e(obj);
                    int i13 = I9.a.f3852u;
                    long jS0 = g.s0(1, I9.c.SECONDS);
                    this.f15591s = 1;
                    Object objK = AbstractC0405x.k(AbstractC0405x.F(jS0), this);
                    if (objK != aVar) {
                        objK = yVar;
                    }
                    if (objK == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                Intent intent = new Intent(mainActivity, (Class<?>) AyahAudioService.class);
                intent.setAction("com.ayah.action.STATUS");
                p166q4.a aVar2 = mainActivity.f13629G0;
                if (aVar2 == null) {
                    j.k("crashLogger");
                    throw null;
                }
                aVar2.a("starting audio service for sendAudioCommand");
                mainActivity.startService(intent);
                return yVar;
        }
    }
}
