package I9;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public enum c {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    /* JADX INFO: Fake field, exist only in values array */
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);


    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TimeUnit f3862r;

    c(TimeUnit timeUnit) {
        this.f3862r = timeUnit;
    }
}
