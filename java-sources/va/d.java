package va;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f23399a = new d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i10;
        p251z9.j.e(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f23397a;
        String loggerName = logRecord.getLoggerName();
        p251z9.j.d(loggerName, "getLoggerName(...)");
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            i10 = 5;
        } else {
            i10 = logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        }
        String message = logRecord.getMessage();
        p251z9.j.d(message, "getMessage(...)");
        c.a(i10, loggerName, logRecord.getThrown(), message);
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
