package S5;

import K9.InterfaceC0402u;
import com.ayah.feature.reminder.ReminderSettingsActivity;
import j$.time.LocalTime;
import k3.f;
import k3.h;
import p110k9.y;
import p241y9.e;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7499r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7500s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ReminderSettingsActivity f7501t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ h f7502u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ LocalTime f7503v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(ReminderSettingsActivity reminderSettingsActivity, h hVar, LocalTime localTime, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f7499r = i10;
        this.f7501t = reminderSettingsActivity;
        this.f7502u = hVar;
        this.f7503v = localTime;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f7499r) {
            case 0:
                return new b(this.f7501t, this.f7502u, this.f7503v, cVar, 0);
            default:
                return new b(this.f7501t, this.f7502u, this.f7503v, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f7499r) {
            case 0:
                break;
        }
        return ((b) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f7499r) {
            case 0:
                int i10 = this.f7500s;
                y yVar = y.f19095a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                L5.c cVarS = this.f7501t.s();
                k3.a aVar = ((f) this.f7502u).f18973a;
                this.f7500s = 1;
                Object objA = ((p208v3.c) cVarS.f5532s).a(aVar, true, this.f7503v, this);
                p161p9.a aVar2 = p161p9.a.f21156r;
                if (objA != aVar2) {
                    objA = yVar;
                }
                return objA == aVar2 ? aVar2 : yVar;
            default:
                int i11 = this.f7500s;
                y yVar2 = y.f19095a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar2;
                }
                p110k9.a.e(obj);
                L5.c cVarS2 = this.f7501t.s();
                k3.a aVar3 = ((f) this.f7502u).f18973a;
                this.f7500s = 1;
                Object objA2 = ((p208v3.c) cVarS2.f5532s).a(aVar3, false, this.f7503v, this);
                p161p9.a aVar4 = p161p9.a.f21156r;
                if (objA2 != aVar4) {
                    objA2 = yVar2;
                }
                return objA2 == aVar4 ? aVar4 : yVar2;
        }
    }
}
