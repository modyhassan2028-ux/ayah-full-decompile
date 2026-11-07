package J3;

import N9.InterfaceC0416i;
import com.ayah.common.data.source.preference.model.PreferencesAppNotification;
import com.squareup.moshi.JsonAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g implements InterfaceC0416i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4251r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0416i f4252s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f4253t;

    public /* synthetic */ g(InterfaceC0416i interfaceC0416i, j jVar, int i10) {
        this.f4251r = i10;
        this.f4252s = interfaceC0416i;
        this.f4253t = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    @Override // N9.InterfaceC0416i
    public final Object b(Object obj, p150o9.c cVar) {
        f fVar;
        i iVar;
        int i10 = this.f4251r;
        p110k9.y yVar = p110k9.y.f19095a;
        InterfaceC0416i interfaceC0416i = this.f4252s;
        p161p9.a aVar = p161p9.a.f21156r;
        j jVar = this.f4253t;
        switch (i10) {
            case 0:
                if (cVar instanceof f) {
                    fVar = (f) cVar;
                    int i11 = fVar.f4249s;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        fVar.f4249s = i11 - Integer.MIN_VALUE;
                    } else {
                        fVar = new f(this, cVar);
                    }
                } else {
                    fVar = new f(this, cVar);
                }
                Object obj2 = fVar.f4248r;
                int i12 = fVar.f4249s;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj2);
                    return yVar;
                }
                p110k9.a.e(obj2);
                String str = (String) ((X1.b) obj).c(jVar.f4263d);
                PreferencesAppNotification preferencesAppNotification = str != null ? (PreferencesAppNotification) jVar.f4261b.b(str) : null;
                fVar.f4249s = 1;
                return interfaceC0416i.b(preferencesAppNotification, fVar) == aVar ? aVar : yVar;
            default:
                JsonAdapter jsonAdapter = jVar.f4261b;
                if (cVar instanceof i) {
                    iVar = (i) cVar;
                    int i13 = iVar.f4258s;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        iVar.f4258s = i13 - Integer.MIN_VALUE;
                    } else {
                        iVar = new i(this, cVar);
                    }
                } else {
                    iVar = new i(this, cVar);
                }
                Object obj3 = iVar.f4257r;
                int i14 = iVar.f4258s;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj3);
                    return yVar;
                }
                p110k9.a.e(obj3);
                X1.b bVar = (X1.b) obj;
                String str2 = (String) bVar.c(jVar.f4262c);
                PreferencesAppNotification preferencesAppNotification2 = str2 != null ? (PreferencesAppNotification) jsonAdapter.b(str2) : null;
                String str3 = (String) bVar.c(jVar.f4263d);
                PreferencesAppNotification preferencesAppNotification3 = str3 != null ? (PreferencesAppNotification) jsonAdapter.b(str3) : null;
                String str4 = (String) bVar.c(jVar.f4264e);
                ArrayList arrayListI0 = p120l9.l.i0(new PreferencesAppNotification[]{preferencesAppNotification3, preferencesAppNotification2, str4 != null ? (PreferencesAppNotification) jsonAdapter.b(str4) : null});
                iVar.f4258s = 1;
                return interfaceC0416i.b(arrayListI0, iVar) == aVar ? aVar : yVar;
        }
    }
}
