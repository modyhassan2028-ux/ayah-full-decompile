package Z4;

import K9.InterfaceC0402u;
import com.ayah.feature.khatmah.ui.wrapper.KhatmahWrapper;
import j$.time.LocalTime;
import p110k9.y;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class f extends i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10997r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10998s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ KhatmahWrapper f10999t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ LocalTime f11000u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(KhatmahWrapper khatmahWrapper, LocalTime localTime, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f10997r = i10;
        this.f10999t = khatmahWrapper;
        this.f11000u = localTime;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f10997r) {
            case 0:
                return new f(this.f10999t, this.f11000u, cVar, 0);
            default:
                return new f(this.f10999t, this.f11000u, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f10997r) {
            case 0:
                break;
        }
        return ((f) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f10997r;
        k3.a aVar = k3.a.DAILY_READING;
        LocalTime localTime = this.f11000u;
        KhatmahWrapper khatmahWrapper = this.f10999t;
        p161p9.a aVar2 = p161p9.a.f21156r;
        y yVar = y.f19095a;
        switch (i10) {
            case 0:
                int i11 = this.f10998s;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    this.f10998s = 1;
                    int i12 = KhatmahWrapper.f13794v;
                    Object objA = khatmahWrapper.getKhatmahPresenter().f8189e.a(aVar, true, localTime, this);
                    if (objA != aVar2) {
                        objA = yVar;
                    }
                    if (objA != aVar2) {
                        objA = yVar;
                    }
                    if (objA == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return yVar;
            default:
                int i13 = this.f10998s;
                if (i13 == 0) {
                    p110k9.a.e(obj);
                    this.f10998s = 1;
                    int i14 = KhatmahWrapper.f13794v;
                    Object objA2 = khatmahWrapper.getKhatmahPresenter().f8189e.a(aVar, false, localTime, this);
                    if (objA2 != aVar2) {
                        objA2 = yVar;
                    }
                    if (objA2 != aVar2) {
                        objA2 = yVar;
                    }
                    if (objA2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return yVar;
        }
    }
}
