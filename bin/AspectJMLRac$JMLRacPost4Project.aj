import org.aspectjml.ajmlrac.runtime.*;
public privileged aspect AspectJMLRac$JMLRacPost4Project {

/** Generated by AspectJML to enable modular signals_only checking (XCS enabled) */
  after(final br.edu.imd.wlademir.Main object$rac): (execution( * br.edu.imd.wlademir.Main..*+.*(..))
          || execution(br.edu.imd.wlademir.Main..*+.new(..))
          || execution( * br.edu.imd.wlademir.Main+.*(..))
          || execution(br.edu.imd.wlademir.Main+.new(..))) && 
   this(object$rac) {
   JMLChecker.hasAnyThrownExceptionalPostconditionSignalsOnly();
  }

/** Generated by AspectJML to enhance error reporting (Execution Site enabled) */
  after() throwing (Throwable rac$e): (execution( * br.edu.imd.wlademir.Main..*+.*(..))
          || execution(br.edu.imd.wlademir.Main..*+.new(..))
          || execution( * br.edu.imd.wlademir.Main+.*(..))
          || execution(br.edu.imd.wlademir.Main+.new(..))){
    JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    JMLChecker.rethrowJMLAssertionError(rac$e);
  }

/** Generated by AspectJML to enable modular signals_only checking (XCS enabled) */
  after(final br.edu.imd.wlademir.Node object$rac): (execution( * br.edu.imd.wlademir.Node..*+.*(..))
          || execution(br.edu.imd.wlademir.Node..*+.new(..))
          || execution( * br.edu.imd.wlademir.Node+.*(..))
          || execution(br.edu.imd.wlademir.Node+.new(..))) && 
   this(object$rac) {
   JMLChecker.hasAnyThrownExceptionalPostconditionSignalsOnly();
  }

/** Generated by AspectJML to enhance error reporting (Execution Site enabled) */
  after() throwing (Throwable rac$e): (execution( * br.edu.imd.wlademir.Node..*+.*(..))
          || execution(br.edu.imd.wlademir.Node..*+.new(..))
          || execution( * br.edu.imd.wlademir.Node+.*(..))
          || execution(br.edu.imd.wlademir.Node+.new(..))){
    JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    JMLChecker.rethrowJMLAssertionError(rac$e);
  }

public static aspect UtilPreconditionChecking_Node$30cfd0cb_2c56_4859_b2bb_08023e2968d9{
  before(): (execution( * br.edu.imd.wlademir.Node..*+.*(..))
          || execution(br.edu.imd.wlademir.Node..*+.new(..))
          || execution( * br.edu.imd.wlademir.Node+.*(..))
          || execution(br.edu.imd.wlademir.Node+.new(..))){
    JMLChecker.hasAnyThrownPrecondition();
  }
}

/** Generated by AspectJML to enable modular signals_only checking (XCS enabled) */
  after(final br.edu.imd.wlademir.Tree object$rac): (execution( * br.edu.imd.wlademir.Tree..*+.*(..))
          || execution(br.edu.imd.wlademir.Tree..*+.new(..))
          || execution( * br.edu.imd.wlademir.Tree+.*(..))
          || execution(br.edu.imd.wlademir.Tree+.new(..))) && 
   this(object$rac) {
   JMLChecker.hasAnyThrownExceptionalPostconditionSignalsOnly();
  }

/** Generated by AspectJML to enhance error reporting (Execution Site enabled) */
  after() throwing (Throwable rac$e): (execution( * br.edu.imd.wlademir.Tree..*+.*(..))
          || execution(br.edu.imd.wlademir.Tree..*+.new(..))
          || execution( * br.edu.imd.wlademir.Tree+.*(..))
          || execution(br.edu.imd.wlademir.Tree+.new(..))){
    JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    JMLChecker.rethrowJMLAssertionError(rac$e);
  }

public static aspect UtilPreconditionChecking_Tree$5de18f59_b7d2_4fb7_b154_330941785a9a{
  before(): (execution( * br.edu.imd.wlademir.Tree..*+.*(..))
          || execution(br.edu.imd.wlademir.Tree..*+.new(..))
          || execution( * br.edu.imd.wlademir.Tree+.*(..))
          || execution(br.edu.imd.wlademir.Tree+.new(..))){
    JMLChecker.hasAnyThrownPrecondition();
  }
}

/** Generated by AspectJML to enable modular signals_only checking (XCS enabled) */
  after(final br.edu.imd.wlademir.TreeView object$rac): (execution( * br.edu.imd.wlademir.TreeView..*+.*(..))
          || execution(br.edu.imd.wlademir.TreeView..*+.new(..))
          || execution( * br.edu.imd.wlademir.TreeView+.*(..))
          || execution(br.edu.imd.wlademir.TreeView+.new(..))) && 
   this(object$rac) {
   JMLChecker.hasAnyThrownExceptionalPostconditionSignalsOnly();
  }

/** Generated by AspectJML to enhance error reporting (Execution Site enabled) */
  after() throwing (Throwable rac$e): (execution( * br.edu.imd.wlademir.TreeView..*+.*(..))
          || execution(br.edu.imd.wlademir.TreeView..*+.new(..))
          || execution( * br.edu.imd.wlademir.TreeView+.*(..))
          || execution(br.edu.imd.wlademir.TreeView+.new(..))){
    JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    JMLChecker.rethrowJMLAssertionError(rac$e);
  }

}