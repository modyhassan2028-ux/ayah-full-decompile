package Z4;

import K9.InterfaceC0402u;
import com.ayah.common.data.source.preference.model.PreferencesKhatmah;
import com.ayah.feature.khatmah.ui.wrapper.KhatmahWrapper;
import j$.time.LocalDate;
import j$.time.format.DateTimeFormatter;
import p110k9.y;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class g extends i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f11001r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11002s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ KhatmahWrapper f11003t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p095j3.a f11004u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(KhatmahWrapper khatmahWrapper, p095j3.a aVar, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f11001r = i10;
        this.f11003t = khatmahWrapper;
        this.f11004u = aVar;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f11001r) {
            case 0:
                return new g(this.f11003t, this.f11004u, cVar, 0);
            default:
                return new g(this.f11003t, this.f11004u, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f11001r) {
            case 0:
                break;
        }
        return ((g) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f11001r) {
            case 0:
                int i10 = this.f11002s;
                y yVar = y.f19095a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                U4.e khatmahPresenter = this.f11003t.getKhatmahPresenter();
                this.f11002s = 1;
                p189t3.b bVar = khatmahPresenter.f8188d;
                p095j3.a aVar = this.f11004u;
                j.e(aVar, "<this>");
                p095j3.c cVar = aVar.f18751a;
                int iB = cVar.b();
                int i11 = aVar.f18754d;
                if (i11 < iB) {
                    aVar = new p095j3.a(cVar, aVar.f18752b, aVar.f18753c, i11 + 1, aVar.f18755e, aVar.f18756f);
                }
                Object objA = bVar.a(aVar, this);
                p161p9.a aVar2 = p161p9.a.f21156r;
                if (objA != aVar2) {
                    objA = yVar;
                }
                return objA == aVar2 ? aVar2 : yVar;
            default:
                int i12 = this.f11002s;
                y yVar2 = y.f19095a;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar2;
                }
                p110k9.a.e(obj);
                U4.e khatmahPresenter2 = this.f11003t.getKhatmahPresenter();
                this.f11002s = 1;
                khatmahPresenter2.getClass();
                p095j3.a aVar3 = this.f11004u;
                j.e(aVar3, "khatmah");
                p095j3.c cVar2 = aVar3.f18751a;
                LocalDate localDateNow = LocalDate.now();
                j.d(localDateNow, "now(...)");
                j.e(cVar2, "khatmahPlan");
                J3.d dVar = khatmahPresenter2.f8188d.f22586a;
                String str = localDateNow.format(DateTimeFormatter.ISO_LOCAL_DATE);
                String strName = cVar2.name();
                j.b(str);
                Object objA2 = dVar.a(new PreferencesKhatmah(-1, 0, strName, str), this);
                p161p9.a aVar4 = p161p9.a.f21156r;
                if (objA2 != aVar4) {
                    objA2 = yVar2;
                }
                if (objA2 != aVar4) {
                    objA2 = yVar2;
                }
                return objA2 == aVar4 ? aVar4 : yVar2;
        }
    }
}
