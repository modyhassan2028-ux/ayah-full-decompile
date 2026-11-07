package p208v3;

import F9.n;
import J3.j;
import X1.e;
import com.ayah.common.data.source.preference.model.AppNotificationType;
import com.ayah.common.data.source.preference.model.PreferencesAppNotification;
import j$.time.LocalTime;
import j$.time.format.DateTimeFormatter;
import k3.a;
import p110k9.y;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f23329a;

    public c(j jVar) {
        p251z9.j.e(jVar, "notificationStore");
        this.f23329a = jVar;
    }

    public final Object a(a aVar, boolean z10, LocalTime localTime, i iVar) {
        AppNotificationType appNotificationType;
        e eVar;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            appNotificationType = AppNotificationType.DAILY_READING;
        } else if (iOrdinal == 1) {
            appNotificationType = AppNotificationType.SURA_KAHF;
        } else {
            if (iOrdinal != 2) {
                throw new A6.a();
            }
            appNotificationType = AppNotificationType.VERSE_OF_THE_DAY;
        }
        String str = localTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
        p251z9.j.b(str);
        PreferencesAppNotification preferencesAppNotification = new PreferencesAppNotification(appNotificationType, z10, str);
        j jVar = this.f23329a;
        jVar.getClass();
        int i10 = J3.e.f4247a[appNotificationType.ordinal()];
        if (i10 == 1) {
            eVar = jVar.f4263d;
        } else if (i10 == 2) {
            eVar = jVar.f4264e;
        } else {
            if (i10 != 3) {
                throw new A6.a();
            }
            eVar = jVar.f4262c;
        }
        Object objT = n.t(jVar.f4260a, new G5.e(eVar, jVar, preferencesAppNotification, (p150o9.c) null, 1), iVar);
        y yVar = y.f19095a;
        p161p9.a aVar2 = p161p9.a.f21156r;
        if (objT != aVar2) {
            objT = yVar;
        }
        return objT == aVar2 ? objT : yVar;
    }
}
