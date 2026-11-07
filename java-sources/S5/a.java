package S5;

import android.app.AlarmManager;
import com.ayah.feature.reminder.ReminderSettingsActivity;
import p110k9.y;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7497r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ReminderSettingsActivity f7498s;

    public /* synthetic */ a(ReminderSettingsActivity reminderSettingsActivity, int i10) {
        this.f7497r = i10;
        this.f7498s = reminderSettingsActivity;
    }

    @Override // p241y9.a
    public final Object invoke() {
        int i10 = this.f7497r;
        ReminderSettingsActivity reminderSettingsActivity = this.f7498s;
        switch (i10) {
            case 0:
                int i11 = ReminderSettingsActivity.f13864a0;
                Object systemService = reminderSettingsActivity.getApplicationContext().getSystemService("alarm");
                j.c(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
                return (AlarmManager) systemService;
            default:
                int i12 = ReminderSettingsActivity.f13864a0;
                reminderSettingsActivity.finish();
                return y.f19095a;
        }
    }
}
