package jplag.csharp6;

import jplag.csharp6.grammar.CSharpParser;
import jplag.csharp6.grammar.CSharpParserListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class JplagCsharp6Listener implements CSharpParserListener, Csharp6TokenConstants {

    private jplag.csharp6.Parser jplagParser;

    public JplagCsharp6Listener(jplag.csharp6.Parser jplag) {
        jplagParser = jplag;
    }
    
    @Override
    public void enterCompilation_unit(CSharpParser.Compilation_unitContext ctx) {
        
    }

    @Override
    public void exitCompilation_unit(CSharpParser.Compilation_unitContext ctx) {
        
    }

    @Override
    public void enterNamespace_or_type_name(CSharpParser.Namespace_or_type_nameContext ctx) {
        
    }

    @Override
    public void exitNamespace_or_type_name(CSharpParser.Namespace_or_type_nameContext ctx) {
        
    }

    @Override
    public void enterType(CSharpParser.TypeContext ctx) {
        
    }

    @Override
    public void exitType(CSharpParser.TypeContext ctx) {
        
    }

    @Override
    public void enterBase_type(CSharpParser.Base_typeContext ctx) {
        
    }

    @Override
    public void exitBase_type(CSharpParser.Base_typeContext ctx) {
        
    }

    @Override
    public void enterSimple_type(CSharpParser.Simple_typeContext ctx) {
        
    }

    @Override
    public void exitSimple_type(CSharpParser.Simple_typeContext ctx) {
        
    }

    @Override
    public void enterNumeric_type(CSharpParser.Numeric_typeContext ctx) {
        
    }

    @Override
    public void exitNumeric_type(CSharpParser.Numeric_typeContext ctx) {
        
    }

    @Override
    public void enterIntegral_type(CSharpParser.Integral_typeContext ctx) {
        
    }

    @Override
    public void exitIntegral_type(CSharpParser.Integral_typeContext ctx) {
        
    }

    @Override
    public void enterFloating_point_type(CSharpParser.Floating_point_typeContext ctx) {
        
    }

    @Override
    public void exitFloating_point_type(CSharpParser.Floating_point_typeContext ctx) {
        
    }

    @Override
    public void enterClass_type(CSharpParser.Class_typeContext ctx) {
        
    }

    @Override
    public void exitClass_type(CSharpParser.Class_typeContext ctx) {
        
    }

    @Override
    public void enterType_argument_list(CSharpParser.Type_argument_listContext ctx) {
        
    }

    @Override
    public void exitType_argument_list(CSharpParser.Type_argument_listContext ctx) {
        
    }

    @Override
    public void enterArgument_list(CSharpParser.Argument_listContext ctx) {
        
    }

    @Override
    public void exitArgument_list(CSharpParser.Argument_listContext ctx) {
        
    }

    @Override
    public void enterArgument(CSharpParser.ArgumentContext ctx) {
        
    }

    @Override
    public void exitArgument(CSharpParser.ArgumentContext ctx) {
        
    }

    @Override
    public void enterExpression(CSharpParser.ExpressionContext ctx) {
        
    }

    @Override
    public void exitExpression(CSharpParser.ExpressionContext ctx) {
        
    }

    @Override
    public void enterNon_assignment_expression(CSharpParser.Non_assignment_expressionContext ctx) {
        
    }

    @Override
    public void exitNon_assignment_expression(CSharpParser.Non_assignment_expressionContext ctx) {
        
    }

    @Override
    public void enterAssignment(CSharpParser.AssignmentContext ctx) {
        jplagParser.add(ASSIGNMENT, ctx.getStart());
    }

    @Override
    public void exitAssignment(CSharpParser.AssignmentContext ctx) {
    }

    @Override
    public void enterAssignment_operator(CSharpParser.Assignment_operatorContext ctx) {
        
    }

    @Override
    public void exitAssignment_operator(CSharpParser.Assignment_operatorContext ctx) {
        
    }

    @Override
    public void enterNull_coalescing_expression(CSharpParser.Null_coalescing_expressionContext ctx) {
        
    }

    @Override
    public void exitNull_coalescing_expression(CSharpParser.Null_coalescing_expressionContext ctx) {
        
    }

    @Override
    public void enterConditional_or_expression(CSharpParser.Conditional_or_expressionContext ctx) {
        
    }

    @Override
    public void exitConditional_or_expression(CSharpParser.Conditional_or_expressionContext ctx) {
        
    }

    @Override
    public void enterConditional_and_expression(CSharpParser.Conditional_and_expressionContext ctx) {
        
    }

    @Override
    public void exitConditional_and_expression(CSharpParser.Conditional_and_expressionContext ctx) {
        
    }

    @Override
    public void enterInclusive_or_expression(CSharpParser.Inclusive_or_expressionContext ctx) {
        
    }

    @Override
    public void exitInclusive_or_expression(CSharpParser.Inclusive_or_expressionContext ctx) {
        
    }

    @Override
    public void enterExclusive_or_expression(CSharpParser.Exclusive_or_expressionContext ctx) {
        
    }

    @Override
    public void exitExclusive_or_expression(CSharpParser.Exclusive_or_expressionContext ctx) {
        
    }

    @Override
    public void enterAnd_expression(CSharpParser.And_expressionContext ctx) {
        
    }

    @Override
    public void exitAnd_expression(CSharpParser.And_expressionContext ctx) {
        
    }

    @Override
    public void enterEquality_expression(CSharpParser.Equality_expressionContext ctx) {
        
    }

    @Override
    public void exitEquality_expression(CSharpParser.Equality_expressionContext ctx) {
        
    }

    @Override
    public void enterRelational_expression(CSharpParser.Relational_expressionContext ctx) {
        
    }

    @Override
    public void exitRelational_expression(CSharpParser.Relational_expressionContext ctx) {
        
    }

    @Override
    public void enterShift_expression(CSharpParser.Shift_expressionContext ctx) {
        
    }

    @Override
    public void exitShift_expression(CSharpParser.Shift_expressionContext ctx) {
        
    }

    @Override
    public void enterAdditive_expression(CSharpParser.Additive_expressionContext ctx) {
        
    }

    @Override
    public void exitAdditive_expression(CSharpParser.Additive_expressionContext ctx) {
        
    }

    @Override
    public void enterMultiplicative_expression(CSharpParser.Multiplicative_expressionContext ctx) {
        
    }

    @Override
    public void exitMultiplicative_expression(CSharpParser.Multiplicative_expressionContext ctx) {
        
    }

    @Override
    public void enterUnary_expression(CSharpParser.Unary_expressionContext ctx) {
        
    }

    @Override
    public void exitUnary_expression(CSharpParser.Unary_expressionContext ctx) {
        
    }

    @Override
    public void enterPrimary_expression(CSharpParser.Primary_expressionContext ctx) {
        
    }

    @Override
    public void exitPrimary_expression(CSharpParser.Primary_expressionContext ctx) {
        
    }

    @Override
    public void enterLiteralExpression(CSharpParser.LiteralExpressionContext ctx) {
        
    }

    @Override
    public void exitLiteralExpression(CSharpParser.LiteralExpressionContext ctx) {
        
    }

    @Override
    public void enterSimpleNameExpression(CSharpParser.SimpleNameExpressionContext ctx) {
        
    }

    @Override
    public void exitSimpleNameExpression(CSharpParser.SimpleNameExpressionContext ctx) {
        
    }

    @Override
    public void enterParenthesisExpressions(CSharpParser.ParenthesisExpressionsContext ctx) {
        
    }

    @Override
    public void exitParenthesisExpressions(CSharpParser.ParenthesisExpressionsContext ctx) {
        
    }

    @Override
    public void enterMemberAccessExpression(CSharpParser.MemberAccessExpressionContext ctx) {
        
    }

    @Override
    public void exitMemberAccessExpression(CSharpParser.MemberAccessExpressionContext ctx) {
        
    }

    @Override
    public void enterLiteralAccessExpression(CSharpParser.LiteralAccessExpressionContext ctx) {
        
    }

    @Override
    public void exitLiteralAccessExpression(CSharpParser.LiteralAccessExpressionContext ctx) {
        
    }

    @Override
    public void enterThisReferenceExpression(CSharpParser.ThisReferenceExpressionContext ctx) {
        
    }

    @Override
    public void exitThisReferenceExpression(CSharpParser.ThisReferenceExpressionContext ctx) {
        
    }

    @Override
    public void enterBaseAccessExpression(CSharpParser.BaseAccessExpressionContext ctx) {
        
    }

    @Override
    public void exitBaseAccessExpression(CSharpParser.BaseAccessExpressionContext ctx) {
        
    }

    @Override
    public void enterObjectCreationExpression(CSharpParser.ObjectCreationExpressionContext ctx) {
        
    }

    @Override
    public void exitObjectCreationExpression(CSharpParser.ObjectCreationExpressionContext ctx) {
        
    }

    @Override
    public void enterTypeofExpression(CSharpParser.TypeofExpressionContext ctx) {
        
    }

    @Override
    public void exitTypeofExpression(CSharpParser.TypeofExpressionContext ctx) {
        
    }

    @Override
    public void enterCheckedExpression(CSharpParser.CheckedExpressionContext ctx) {
        
    }

    @Override
    public void exitCheckedExpression(CSharpParser.CheckedExpressionContext ctx) {
        
    }

    @Override
    public void enterUncheckedExpression(CSharpParser.UncheckedExpressionContext ctx) {
        
    }

    @Override
    public void exitUncheckedExpression(CSharpParser.UncheckedExpressionContext ctx) {
        
    }

    @Override
    public void enterDefaultValueExpression(CSharpParser.DefaultValueExpressionContext ctx) {
        
    }

    @Override
    public void exitDefaultValueExpression(CSharpParser.DefaultValueExpressionContext ctx) {
        
    }

    @Override
    public void enterAnonymousMethodExpression(CSharpParser.AnonymousMethodExpressionContext ctx) {
        
    }

    @Override
    public void exitAnonymousMethodExpression(CSharpParser.AnonymousMethodExpressionContext ctx) {
        
    }

    @Override
    public void enterSizeofExpression(CSharpParser.SizeofExpressionContext ctx) {
        
    }

    @Override
    public void exitSizeofExpression(CSharpParser.SizeofExpressionContext ctx) {
        
    }

    @Override
    public void enterNameofExpression(CSharpParser.NameofExpressionContext ctx) {
        
    }

    @Override
    public void exitNameofExpression(CSharpParser.NameofExpressionContext ctx) {
        
    }

    @Override
    public void enterMember_access(CSharpParser.Member_accessContext ctx) {
        
    }

    @Override
    public void exitMember_access(CSharpParser.Member_accessContext ctx) {
        
    }

    @Override
    public void enterBracket_expression(CSharpParser.Bracket_expressionContext ctx) {
        
    }

    @Override
    public void exitBracket_expression(CSharpParser.Bracket_expressionContext ctx) {
        
    }

    @Override
    public void enterIndexer_argument(CSharpParser.Indexer_argumentContext ctx) {
        
    }

    @Override
    public void exitIndexer_argument(CSharpParser.Indexer_argumentContext ctx) {
        
    }

    @Override
    public void enterPredefined_type(CSharpParser.Predefined_typeContext ctx) {
        
    }

    @Override
    public void exitPredefined_type(CSharpParser.Predefined_typeContext ctx) {
        
    }

    @Override
    public void enterExpression_list(CSharpParser.Expression_listContext ctx) {
        
    }

    @Override
    public void exitExpression_list(CSharpParser.Expression_listContext ctx) {
        
    }

    @Override
    public void enterObject_or_collection_initializer(CSharpParser.Object_or_collection_initializerContext ctx) {
    }

    @Override
    public void exitObject_or_collection_initializer(CSharpParser.Object_or_collection_initializerContext ctx) {
    }

    @Override
    public void enterObject_initializer(CSharpParser.Object_initializerContext ctx) {
        
    }

    @Override
    public void exitObject_initializer(CSharpParser.Object_initializerContext ctx) {
        
    }

    @Override
    public void enterMember_initializer_list(CSharpParser.Member_initializer_listContext ctx) {
        
    }

    @Override
    public void exitMember_initializer_list(CSharpParser.Member_initializer_listContext ctx) {
        
    }

    @Override
    public void enterMember_initializer(CSharpParser.Member_initializerContext ctx) {
        
    }

    @Override
    public void exitMember_initializer(CSharpParser.Member_initializerContext ctx) {
        
    }

    @Override
    public void enterInitializer_value(CSharpParser.Initializer_valueContext ctx) {
        
    }

    @Override
    public void exitInitializer_value(CSharpParser.Initializer_valueContext ctx) {
        
    }

    @Override
    public void enterCollection_initializer(CSharpParser.Collection_initializerContext ctx) {
        
    }

    @Override
    public void exitCollection_initializer(CSharpParser.Collection_initializerContext ctx) {
        
    }

    @Override
    public void enterElement_initializer(CSharpParser.Element_initializerContext ctx) {
        
    }

    @Override
    public void exitElement_initializer(CSharpParser.Element_initializerContext ctx) {
        
    }

    @Override
    public void enterAnonymous_object_initializer(CSharpParser.Anonymous_object_initializerContext ctx) {
        
    }

    @Override
    public void exitAnonymous_object_initializer(CSharpParser.Anonymous_object_initializerContext ctx) {
        
    }

    @Override
    public void enterMember_declarator_list(CSharpParser.Member_declarator_listContext ctx) {
        
    }

    @Override
    public void exitMember_declarator_list(CSharpParser.Member_declarator_listContext ctx) {
        
    }

    @Override
    public void enterMember_declarator(CSharpParser.Member_declaratorContext ctx) {
        
    }

    @Override
    public void exitMember_declarator(CSharpParser.Member_declaratorContext ctx) {
        
    }

    @Override
    public void enterUnbound_type_name(CSharpParser.Unbound_type_nameContext ctx) {
        
    }

    @Override
    public void exitUnbound_type_name(CSharpParser.Unbound_type_nameContext ctx) {
        
    }

    @Override
    public void enterGeneric_dimension_specifier(CSharpParser.Generic_dimension_specifierContext ctx) {
        
    }

    @Override
    public void exitGeneric_dimension_specifier(CSharpParser.Generic_dimension_specifierContext ctx) {
        
    }

    @Override
    public void enterIsType(CSharpParser.IsTypeContext ctx) {
        
    }

    @Override
    public void exitIsType(CSharpParser.IsTypeContext ctx) {
        
    }

    @Override
    public void enterLambda_expression(CSharpParser.Lambda_expressionContext ctx) {
        
    }

    @Override
    public void exitLambda_expression(CSharpParser.Lambda_expressionContext ctx) {
        
    }

    @Override
    public void enterAnonymous_function_signature(CSharpParser.Anonymous_function_signatureContext ctx) {
        
    }

    @Override
    public void exitAnonymous_function_signature(CSharpParser.Anonymous_function_signatureContext ctx) {
        
    }

    @Override
    public void enterExplicit_anonymous_function_parameter_list(CSharpParser.Explicit_anonymous_function_parameter_listContext ctx) {
        
    }

    @Override
    public void exitExplicit_anonymous_function_parameter_list(CSharpParser.Explicit_anonymous_function_parameter_listContext ctx) {
        
    }

    @Override
    public void enterExplicit_anonymous_function_parameter(CSharpParser.Explicit_anonymous_function_parameterContext ctx) {
        
    }

    @Override
    public void exitExplicit_anonymous_function_parameter(CSharpParser.Explicit_anonymous_function_parameterContext ctx) {
        
    }

    @Override
    public void enterImplicit_anonymous_function_parameter_list(CSharpParser.Implicit_anonymous_function_parameter_listContext ctx) {
        
    }

    @Override
    public void exitImplicit_anonymous_function_parameter_list(CSharpParser.Implicit_anonymous_function_parameter_listContext ctx) {
        
    }

    @Override
    public void enterAnonymous_function_body(CSharpParser.Anonymous_function_bodyContext ctx) {
        
    }

    @Override
    public void exitAnonymous_function_body(CSharpParser.Anonymous_function_bodyContext ctx) {
        
    }

    @Override
    public void enterQuery_expression(CSharpParser.Query_expressionContext ctx) {
        
    }

    @Override
    public void exitQuery_expression(CSharpParser.Query_expressionContext ctx) {
        
    }

    @Override
    public void enterFrom_clause(CSharpParser.From_clauseContext ctx) {
        
    }

    @Override
    public void exitFrom_clause(CSharpParser.From_clauseContext ctx) {
        
    }

    @Override
    public void enterQuery_body(CSharpParser.Query_bodyContext ctx) {
        
    }

    @Override
    public void exitQuery_body(CSharpParser.Query_bodyContext ctx) {
        
    }

    @Override
    public void enterQuery_body_clause(CSharpParser.Query_body_clauseContext ctx) {
        
    }

    @Override
    public void exitQuery_body_clause(CSharpParser.Query_body_clauseContext ctx) {
        
    }

    @Override
    public void enterLet_clause(CSharpParser.Let_clauseContext ctx) {
        
    }

    @Override
    public void exitLet_clause(CSharpParser.Let_clauseContext ctx) {
        
    }

    @Override
    public void enterWhere_clause(CSharpParser.Where_clauseContext ctx) {
        
    }

    @Override
    public void exitWhere_clause(CSharpParser.Where_clauseContext ctx) {
        
    }

    @Override
    public void enterCombined_join_clause(CSharpParser.Combined_join_clauseContext ctx) {
        
    }

    @Override
    public void exitCombined_join_clause(CSharpParser.Combined_join_clauseContext ctx) {
        
    }

    @Override
    public void enterOrderby_clause(CSharpParser.Orderby_clauseContext ctx) {
        
    }

    @Override
    public void exitOrderby_clause(CSharpParser.Orderby_clauseContext ctx) {
        
    }

    @Override
    public void enterOrdering(CSharpParser.OrderingContext ctx) {
        
    }

    @Override
    public void exitOrdering(CSharpParser.OrderingContext ctx) {
        
    }

    @Override
    public void enterSelect_or_group_clause(CSharpParser.Select_or_group_clauseContext ctx) {
        
    }

    @Override
    public void exitSelect_or_group_clause(CSharpParser.Select_or_group_clauseContext ctx) {
        
    }

    @Override
    public void enterQuery_continuation(CSharpParser.Query_continuationContext ctx) {
        
    }

    @Override
    public void exitQuery_continuation(CSharpParser.Query_continuationContext ctx) {
        
    }

    @Override
    public void enterLabeledStatement(CSharpParser.LabeledStatementContext ctx) {
        
    }

    @Override
    public void exitLabeledStatement(CSharpParser.LabeledStatementContext ctx) {
        
    }

    @Override
    public void enterDeclarationStatement(CSharpParser.DeclarationStatementContext ctx) {
        
    }

    @Override
    public void exitDeclarationStatement(CSharpParser.DeclarationStatementContext ctx) {
        
    }

    @Override
    public void enterEmbeddedStatement(CSharpParser.EmbeddedStatementContext ctx) {
        
    }

    @Override
    public void exitEmbeddedStatement(CSharpParser.EmbeddedStatementContext ctx) {
        
    }

    @Override
    public void enterLabeled_Statement(CSharpParser.Labeled_StatementContext ctx) {
        
    }

    @Override
    public void exitLabeled_Statement(CSharpParser.Labeled_StatementContext ctx) {
        
    }

    @Override
    public void enterEmbedded_statement(CSharpParser.Embedded_statementContext ctx) {
        
    }

    @Override
    public void exitEmbedded_statement(CSharpParser.Embedded_statementContext ctx) {
        
    }

    @Override
    public void enterEmptyStatement(CSharpParser.EmptyStatementContext ctx) {
        
    }

    @Override
    public void exitEmptyStatement(CSharpParser.EmptyStatementContext ctx) {
        
    }

    @Override
    public void enterExpressionStatement(CSharpParser.ExpressionStatementContext ctx) {
        
    }

    @Override
    public void exitExpressionStatement(CSharpParser.ExpressionStatementContext ctx) {
        
    }

    @Override
    public void enterIfStatement(CSharpParser.IfStatementContext ctx) {
        jplagParser.add(IF_BEGIN, ctx.getStart());
    }

    @Override
    public void exitIfStatement(CSharpParser.IfStatementContext ctx) {
        jplagParser.add(IF_END, ctx.getStop());
    }

    @Override
    public void enterSwitchStatement(CSharpParser.SwitchStatementContext ctx) {
        jplagParser.add(SWITCH_BEGIN, ctx.getStart());
    }

    @Override
    public void exitSwitchStatement(CSharpParser.SwitchStatementContext ctx) {
        jplagParser.add(SWITCH_END, ctx.getStop());
    }

    @Override
    public void enterWhileStatement(CSharpParser.WhileStatementContext ctx) {
        jplagParser.add(WHILE_BEGIN, ctx.getStart());
    }

    @Override
    public void exitWhileStatement(CSharpParser.WhileStatementContext ctx) {
        jplagParser.add(WHILE_END, ctx.getStop());
    }

    @Override
    public void enterDoStatement(CSharpParser.DoStatementContext ctx) {
        jplagParser.add(DO_WHILE_BEGIN, ctx.getStart());
    }

    @Override
    public void exitDoStatement(CSharpParser.DoStatementContext ctx) {
        jplagParser.add(DO_WHILE_END, ctx.getStop());
    }

    @Override
    public void enterForStatement(CSharpParser.ForStatementContext ctx) {
        jplagParser.add(FOR_BEGIN, ctx.getStart());
    }

    @Override
    public void exitForStatement(CSharpParser.ForStatementContext ctx) {
        jplagParser.add(FOR_END, ctx.getStart());
    }

    @Override
    public void enterForeachStatement(CSharpParser.ForeachStatementContext ctx) {
        jplagParser.add(FOREACH_BEGIN, ctx.getStart());
    }

    @Override
    public void exitForeachStatement(CSharpParser.ForeachStatementContext ctx) {
        jplagParser.add(FOREACH_END, ctx.getStop());
    }

    @Override
    public void enterBreakStatement(CSharpParser.BreakStatementContext ctx) {
        jplagParser.add(BREAK, ctx.getStart());
    }

    @Override
    public void exitBreakStatement(CSharpParser.BreakStatementContext ctx) {
        
    }

    @Override
    public void enterContinueStatement(CSharpParser.ContinueStatementContext ctx) {
        jplagParser.add(CONTINUE,ctx.getStart());
    }

    @Override
    public void exitContinueStatement(CSharpParser.ContinueStatementContext ctx) {
        
    }

    @Override
    public void enterGotoStatement(CSharpParser.GotoStatementContext ctx) {
        
    }

    @Override
    public void exitGotoStatement(CSharpParser.GotoStatementContext ctx) {
        
    }

    @Override
    public void enterReturnStatement(CSharpParser.ReturnStatementContext ctx) {
       jplagParser.add(RETURN, ctx.getStart());
    }

    @Override
    public void exitReturnStatement(CSharpParser.ReturnStatementContext ctx) {
        
    }

    @Override
    public void enterThrowStatement(CSharpParser.ThrowStatementContext ctx) {
        jplagParser.add(THROW,ctx.getStart());
    }

    @Override
    public void exitThrowStatement(CSharpParser.ThrowStatementContext ctx) {
    }

    @Override
    public void enterTryStatement(CSharpParser.TryStatementContext ctx) {
        jplagParser.add(TRY_BEGIN, ctx.getStart());
    }

    @Override
    public void exitTryStatement(CSharpParser.TryStatementContext ctx) {
        jplagParser.add(TRY_END, ctx.getStop());
    }

    @Override
    public void enterCheckedStatement(CSharpParser.CheckedStatementContext ctx) {
        
    }

    @Override
    public void exitCheckedStatement(CSharpParser.CheckedStatementContext ctx) {
        
    }

    @Override
    public void enterUncheckedStatement(CSharpParser.UncheckedStatementContext ctx) {
        
    }

    @Override
    public void exitUncheckedStatement(CSharpParser.UncheckedStatementContext ctx) {
        
    }

    @Override
    public void enterLockStatement(CSharpParser.LockStatementContext ctx) {
        
    }

    @Override
    public void exitLockStatement(CSharpParser.LockStatementContext ctx) {
        
    }

    @Override
    public void enterUsingStatement(CSharpParser.UsingStatementContext ctx) {
        jplagParser.add(USING_STATEMENT, ctx.getStart());
    }

    @Override
    public void exitUsingStatement(CSharpParser.UsingStatementContext ctx) {
        
    }

    @Override
    public void enterYieldStatement(CSharpParser.YieldStatementContext ctx) {
        
    }

    @Override
    public void exitYieldStatement(CSharpParser.YieldStatementContext ctx) {
        
    }

    @Override
    public void enterUnsafeStatement(CSharpParser.UnsafeStatementContext ctx) {
        
    }

    @Override
    public void exitUnsafeStatement(CSharpParser.UnsafeStatementContext ctx) {
        
    }

    @Override
    public void enterFixedStatement(CSharpParser.FixedStatementContext ctx) {
        
    }

    @Override
    public void exitFixedStatement(CSharpParser.FixedStatementContext ctx) {
        
    }

    @Override
    public void enterBlock(CSharpParser.BlockContext ctx) {
        
    }

    @Override
    public void exitBlock(CSharpParser.BlockContext ctx) {
        
    }

    @Override
    public void enterLocal_variable_declaration(CSharpParser.Local_variable_declarationContext ctx) {
        
    }

    @Override
    public void exitLocal_variable_declaration(CSharpParser.Local_variable_declarationContext ctx) {
        
    }

    @Override
    public void enterLocal_variable_type(CSharpParser.Local_variable_typeContext ctx) {
        
    }

    @Override
    public void exitLocal_variable_type(CSharpParser.Local_variable_typeContext ctx) {
        
    }

    @Override
    public void enterLocal_variable_declarator(CSharpParser.Local_variable_declaratorContext ctx) {
        jplagParser.add(VARIABLE_AND_CONSTANT_DECLARATOR, ctx.getStart());
    }

    @Override
    public void exitLocal_variable_declarator(CSharpParser.Local_variable_declaratorContext ctx) {
        
    }

    @Override
    public void enterLocal_variable_initializer(CSharpParser.Local_variable_initializerContext ctx) {
        
    }

    @Override
    public void exitLocal_variable_initializer(CSharpParser.Local_variable_initializerContext ctx) {
        
    }

    @Override
    public void enterLocal_constant_declaration(CSharpParser.Local_constant_declarationContext ctx) {

    }

    @Override
    public void exitLocal_constant_declaration(CSharpParser.Local_constant_declarationContext ctx) {

    }

    @Override
    public void enterIf_body(CSharpParser.If_bodyContext ctx) {
        
    }

    @Override
    public void exitIf_body(CSharpParser.If_bodyContext ctx) {
        
    }

    @Override
    public void enterSwitch_section(CSharpParser.Switch_sectionContext ctx) {
        
    }

    @Override
    public void exitSwitch_section(CSharpParser.Switch_sectionContext ctx) {
        
    }

    @Override
    public void enterSwitch_label(CSharpParser.Switch_labelContext ctx) {
    }

    @Override
    public void exitSwitch_label(CSharpParser.Switch_labelContext ctx) {
        jplagParser.add(CASE, ctx.getStop());
    }

    @Override
    public void enterStatement_list(CSharpParser.Statement_listContext ctx) {
        
    }

    @Override
    public void exitStatement_list(CSharpParser.Statement_listContext ctx) {
        
    }

    @Override
    public void enterFor_initializer(CSharpParser.For_initializerContext ctx) {
        
    }

    @Override
    public void exitFor_initializer(CSharpParser.For_initializerContext ctx) {
        
    }

    @Override
    public void enterFor_iterator(CSharpParser.For_iteratorContext ctx) {
        
    }

    @Override
    public void exitFor_iterator(CSharpParser.For_iteratorContext ctx) {
        
    }

    @Override
    public void enterCatch_clauses(CSharpParser.Catch_clausesContext ctx) {
        
    }

    @Override
    public void exitCatch_clauses(CSharpParser.Catch_clausesContext ctx) {
        
    }

    @Override
    public void enterSpecific_catch_clause(CSharpParser.Specific_catch_clauseContext ctx) {
        jplagParser.add(GENERAL_AND_SPECIFIC_CATCH_BEGIN, ctx.getStart());
    }

    @Override
    public void exitSpecific_catch_clause(CSharpParser.Specific_catch_clauseContext ctx) {
        jplagParser.add(GENERAL_AND_SPECIFIC_CATCH_END, ctx.getStop());
    }

    @Override
    public void enterGeneral_catch_clause(CSharpParser.General_catch_clauseContext ctx) {
        jplagParser.add(GENERAL_AND_SPECIFIC_CATCH_BEGIN, ctx.getStart());
    }

    @Override
    public void exitGeneral_catch_clause(CSharpParser.General_catch_clauseContext ctx) {
        jplagParser.add(GENERAL_AND_SPECIFIC_CATCH_END, ctx.getStop());
    }

    @Override
    public void enterException_filter(CSharpParser.Exception_filterContext ctx) {
        
    }

    @Override
    public void exitException_filter(CSharpParser.Exception_filterContext ctx) {
        
    }

    @Override
    public void enterFinally_clause(CSharpParser.Finally_clauseContext ctx) {
        jplagParser.add(FINALLY_BEGIN, ctx.getStart());
    }

    @Override
    public void exitFinally_clause(CSharpParser.Finally_clauseContext ctx) {
        jplagParser.add(FINALLY_END, ctx.getStop());
    }

    @Override
    public void enterResource_acquisition(CSharpParser.Resource_acquisitionContext ctx) {
        
    }

    @Override
    public void exitResource_acquisition(CSharpParser.Resource_acquisitionContext ctx) {
        
    }

    @Override
    public void enterNamespace_declaration(CSharpParser.Namespace_declarationContext ctx) {
        jplagParser.add(NAMESPACE_DECLARATION, ctx.getStart());
    }

    @Override
    public void exitNamespace_declaration(CSharpParser.Namespace_declarationContext ctx) {
    }

    @Override
    public void enterQualified_identifier(CSharpParser.Qualified_identifierContext ctx) {
        
    }

    @Override
    public void exitQualified_identifier(CSharpParser.Qualified_identifierContext ctx) {
        
    }

    @Override
    public void enterNamespace_body(CSharpParser.Namespace_bodyContext ctx) {
        
    }

    @Override
    public void exitNamespace_body(CSharpParser.Namespace_bodyContext ctx) {
        
    }

    @Override
    public void enterExtern_alias_directives(CSharpParser.Extern_alias_directivesContext ctx) {
        
    }

    @Override
    public void exitExtern_alias_directives(CSharpParser.Extern_alias_directivesContext ctx) {
        
    }

    @Override
    public void enterExtern_alias_directive(CSharpParser.Extern_alias_directiveContext ctx) {
        
    }

    @Override
    public void exitExtern_alias_directive(CSharpParser.Extern_alias_directiveContext ctx) {
        
    }

    @Override
    public void enterUsing_directives(CSharpParser.Using_directivesContext ctx) {
        // wrapper for multiple using statements
    }

    @Override
    public void exitUsing_directives(CSharpParser.Using_directivesContext ctx) {
        
    }

    @Override
    public void enterUsingAliasDirective(CSharpParser.UsingAliasDirectiveContext ctx) {
        jplagParser.add(USING_DIRECTIVE, ctx.getStart());
    }

    @Override
    public void exitUsingAliasDirective(CSharpParser.UsingAliasDirectiveContext ctx) {
        
    }

    @Override
    public void enterUsingNamespaceDirective(CSharpParser.UsingNamespaceDirectiveContext ctx) {
        jplagParser.add(USING_DIRECTIVE, ctx.getStart());
    }

    @Override
    public void exitUsingNamespaceDirective(CSharpParser.UsingNamespaceDirectiveContext ctx) {
        
    }

    @Override
    public void enterUsingStaticDirective(CSharpParser.UsingStaticDirectiveContext ctx) {
        jplagParser.add(USING_DIRECTIVE, ctx.getStart());
    }

    @Override
    public void exitUsingStaticDirective(CSharpParser.UsingStaticDirectiveContext ctx) {
        
    }

    @Override
    public void enterNamespace_member_declarations(CSharpParser.Namespace_member_declarationsContext ctx) {
        
    }

    @Override
    public void exitNamespace_member_declarations(CSharpParser.Namespace_member_declarationsContext ctx) {
        
    }

    @Override
    public void enterNamespace_member_declaration(CSharpParser.Namespace_member_declarationContext ctx) {
        
    }

    @Override
    public void exitNamespace_member_declaration(CSharpParser.Namespace_member_declarationContext ctx) {
        
    }

    @Override
    public void enterType_declaration(CSharpParser.Type_declarationContext ctx) {
        
    }

    @Override
    public void exitType_declaration(CSharpParser.Type_declarationContext ctx) {
        
    }

    @Override
    public void enterQualified_alias_member(CSharpParser.Qualified_alias_memberContext ctx) {
        
    }

    @Override
    public void exitQualified_alias_member(CSharpParser.Qualified_alias_memberContext ctx) {
        
    }

    @Override
    public void enterType_parameter_list(CSharpParser.Type_parameter_listContext ctx) {
        
    }

    @Override
    public void exitType_parameter_list(CSharpParser.Type_parameter_listContext ctx) {
        
    }

    @Override
    public void enterType_parameter(CSharpParser.Type_parameterContext ctx) {
        
    }

    @Override
    public void exitType_parameter(CSharpParser.Type_parameterContext ctx) {
        
    }

    @Override
    public void enterClass_base(CSharpParser.Class_baseContext ctx) {
        
    }

    @Override
    public void exitClass_base(CSharpParser.Class_baseContext ctx) {
        
    }

    @Override
    public void enterInterface_type_list(CSharpParser.Interface_type_listContext ctx) {
        
    }

    @Override
    public void exitInterface_type_list(CSharpParser.Interface_type_listContext ctx) {
        
    }

    @Override
    public void enterType_parameter_constraints_clauses(CSharpParser.Type_parameter_constraints_clausesContext ctx) {
        
    }

    @Override
    public void exitType_parameter_constraints_clauses(CSharpParser.Type_parameter_constraints_clausesContext ctx) {
        
    }

    @Override
    public void enterType_parameter_constraints_clause(CSharpParser.Type_parameter_constraints_clauseContext ctx) {
        
    }

    @Override
    public void exitType_parameter_constraints_clause(CSharpParser.Type_parameter_constraints_clauseContext ctx) {
        
    }

    @Override
    public void enterType_parameter_constraints(CSharpParser.Type_parameter_constraintsContext ctx) {
        
    }

    @Override
    public void exitType_parameter_constraints(CSharpParser.Type_parameter_constraintsContext ctx) {
        
    }

    @Override
    public void enterPrimary_constraint(CSharpParser.Primary_constraintContext ctx) {
        
    }

    @Override
    public void exitPrimary_constraint(CSharpParser.Primary_constraintContext ctx) {
        
    }

    @Override
    public void enterSecondary_constraints(CSharpParser.Secondary_constraintsContext ctx) {
        
    }

    @Override
    public void exitSecondary_constraints(CSharpParser.Secondary_constraintsContext ctx) {
        
    }

    @Override
    public void enterConstructor_constraint(CSharpParser.Constructor_constraintContext ctx) {
        
    }

    @Override
    public void exitConstructor_constraint(CSharpParser.Constructor_constraintContext ctx) {
        
    }

    @Override
    public void enterClass_body(CSharpParser.Class_bodyContext ctx) {
        
    }

    @Override
    public void exitClass_body(CSharpParser.Class_bodyContext ctx) {
        
    }

    @Override
    public void enterClass_member_declarations(CSharpParser.Class_member_declarationsContext ctx) {
        //jplagParser.add(CLASS_MEMBER_DECLARATIONS_BEGIN, ctx.getStart());
    }

    @Override
    public void exitClass_member_declarations(CSharpParser.Class_member_declarationsContext ctx) {
        //jplagParser.add(CLASS_MEMBER_DECLARATIONS_END, ctx.getStop());
    }

    @Override
    public void enterClass_member_declaration(CSharpParser.Class_member_declarationContext ctx) {
        
    }

    @Override
    public void exitClass_member_declaration(CSharpParser.Class_member_declarationContext ctx) {
        
    }

    @Override
    public void enterAll_member_modifiers(CSharpParser.All_member_modifiersContext ctx) {
        
    }

    @Override
    public void exitAll_member_modifiers(CSharpParser.All_member_modifiersContext ctx) {
        
    }

    @Override
    public void enterAll_member_modifier(CSharpParser.All_member_modifierContext ctx) {
        
    }

    @Override
    public void exitAll_member_modifier(CSharpParser.All_member_modifierContext ctx) {
        
    }

    @Override
    public void enterCommon_member_declaration(CSharpParser.Common_member_declarationContext ctx) {
        
    }

    @Override
    public void exitCommon_member_declaration(CSharpParser.Common_member_declarationContext ctx) {
        
    }

    @Override
    public void enterTyped_member_declaration(CSharpParser.Typed_member_declarationContext ctx) {
        
    }

    @Override
    public void exitTyped_member_declaration(CSharpParser.Typed_member_declarationContext ctx) {
        
    }

    @Override
    public void enterConstant_declarators(CSharpParser.Constant_declaratorsContext ctx) {
        
    }

    @Override
    public void exitConstant_declarators(CSharpParser.Constant_declaratorsContext ctx) {
        
    }

    @Override
    public void enterConstant_declarator(CSharpParser.Constant_declaratorContext ctx) {
        jplagParser.add(VARIABLE_AND_CONSTANT_DECLARATOR, ctx.getStart());
    }

    @Override
    public void exitConstant_declarator(CSharpParser.Constant_declaratorContext ctx) {
        
    }

    @Override
    public void enterVariable_declarators(CSharpParser.Variable_declaratorsContext ctx) {
        
    }

    @Override
    public void exitVariable_declarators(CSharpParser.Variable_declaratorsContext ctx) {
        
    }

    @Override
    public void enterVariable_declarator(CSharpParser.Variable_declaratorContext ctx) {
        jplagParser.add(VARIABLE_AND_CONSTANT_DECLARATOR, ctx.getStart());
    }

    @Override
    public void exitVariable_declarator(CSharpParser.Variable_declaratorContext ctx) {
        
    }

    @Override
    public void enterVariable_initializer(CSharpParser.Variable_initializerContext ctx) {
        
    }

    @Override
    public void exitVariable_initializer(CSharpParser.Variable_initializerContext ctx) {
        
    }

    @Override
    public void enterReturn_type(CSharpParser.Return_typeContext ctx) {
        
    }

    @Override
    public void exitReturn_type(CSharpParser.Return_typeContext ctx) {
        
    }

    @Override
    public void enterMember_name(CSharpParser.Member_nameContext ctx) {
        
    }

    @Override
    public void exitMember_name(CSharpParser.Member_nameContext ctx) {
        
    }

    @Override
    public void enterMethod_body(CSharpParser.Method_bodyContext ctx) {
        
    }

    @Override
    public void exitMethod_body(CSharpParser.Method_bodyContext ctx) {
        
    }

    @Override
    public void enterFormal_parameter_list(CSharpParser.Formal_parameter_listContext ctx) {
        
    }

    @Override
    public void exitFormal_parameter_list(CSharpParser.Formal_parameter_listContext ctx) {
        
    }

    @Override
    public void enterFixed_parameters(CSharpParser.Fixed_parametersContext ctx) {
        
    }

    @Override
    public void exitFixed_parameters(CSharpParser.Fixed_parametersContext ctx) {
        
    }

    @Override
    public void enterFixed_parameter(CSharpParser.Fixed_parameterContext ctx) {
        
    }

    @Override
    public void exitFixed_parameter(CSharpParser.Fixed_parameterContext ctx) {
        
    }

    @Override
    public void enterParameter_modifier(CSharpParser.Parameter_modifierContext ctx) {
        
    }

    @Override
    public void exitParameter_modifier(CSharpParser.Parameter_modifierContext ctx) {
        
    }

    @Override
    public void enterParameter_array(CSharpParser.Parameter_arrayContext ctx) {
        
    }

    @Override
    public void exitParameter_array(CSharpParser.Parameter_arrayContext ctx) {
        
    }

    @Override
    public void enterAccessor_declarations(CSharpParser.Accessor_declarationsContext ctx) {
        
    }

    @Override
    public void exitAccessor_declarations(CSharpParser.Accessor_declarationsContext ctx) {
        
    }

    @Override
    public void enterGet_accessor_declaration(CSharpParser.Get_accessor_declarationContext ctx) {
        
    }

    @Override
    public void exitGet_accessor_declaration(CSharpParser.Get_accessor_declarationContext ctx) {
        
    }

    @Override
    public void enterSet_accessor_declaration(CSharpParser.Set_accessor_declarationContext ctx) {
        
    }

    @Override
    public void exitSet_accessor_declaration(CSharpParser.Set_accessor_declarationContext ctx) {
        
    }

    @Override
    public void enterAccessor_modifier(CSharpParser.Accessor_modifierContext ctx) {
        
    }

    @Override
    public void exitAccessor_modifier(CSharpParser.Accessor_modifierContext ctx) {
        
    }

    @Override
    public void enterAccessor_body(CSharpParser.Accessor_bodyContext ctx) {
        
    }

    @Override
    public void exitAccessor_body(CSharpParser.Accessor_bodyContext ctx) {
        
    }

    @Override
    public void enterEvent_accessor_declarations(CSharpParser.Event_accessor_declarationsContext ctx) {
        
    }

    @Override
    public void exitEvent_accessor_declarations(CSharpParser.Event_accessor_declarationsContext ctx) {
        
    }

    @Override
    public void enterAdd_accessor_declaration(CSharpParser.Add_accessor_declarationContext ctx) {
        
    }

    @Override
    public void exitAdd_accessor_declaration(CSharpParser.Add_accessor_declarationContext ctx) {
        
    }

    @Override
    public void enterRemove_accessor_declaration(CSharpParser.Remove_accessor_declarationContext ctx) {
        
    }

    @Override
    public void exitRemove_accessor_declaration(CSharpParser.Remove_accessor_declarationContext ctx) {
        
    }

    @Override
    public void enterOverloadable_operator(CSharpParser.Overloadable_operatorContext ctx) {
        
    }

    @Override
    public void exitOverloadable_operator(CSharpParser.Overloadable_operatorContext ctx) {
        
    }

    @Override
    public void enterConversion_operator_declarator(CSharpParser.Conversion_operator_declaratorContext ctx) {
        
    }

    @Override
    public void exitConversion_operator_declarator(CSharpParser.Conversion_operator_declaratorContext ctx) {
        
    }

    @Override
    public void enterConstructor_initializer(CSharpParser.Constructor_initializerContext ctx) {
        
    }

    @Override
    public void exitConstructor_initializer(CSharpParser.Constructor_initializerContext ctx) {
        
    }

    @Override
    public void enterBody(CSharpParser.BodyContext ctx) {
        
    }

    @Override
    public void exitBody(CSharpParser.BodyContext ctx) {
        
    }

    @Override
    public void enterStruct_interfaces(CSharpParser.Struct_interfacesContext ctx) {
        
    }

    @Override
    public void exitStruct_interfaces(CSharpParser.Struct_interfacesContext ctx) {
        
    }

    @Override
    public void enterStruct_body(CSharpParser.Struct_bodyContext ctx) {
        
    }

    @Override
    public void exitStruct_body(CSharpParser.Struct_bodyContext ctx) {
        
    }

    @Override
    public void enterStruct_member_declaration(CSharpParser.Struct_member_declarationContext ctx) {
        
    }

    @Override
    public void exitStruct_member_declaration(CSharpParser.Struct_member_declarationContext ctx) {
        
    }

    @Override
    public void enterArray_type(CSharpParser.Array_typeContext ctx) {
        
    }

    @Override
    public void exitArray_type(CSharpParser.Array_typeContext ctx) {
        
    }

    @Override
    public void enterRank_specifier(CSharpParser.Rank_specifierContext ctx) {
        
    }

    @Override
    public void exitRank_specifier(CSharpParser.Rank_specifierContext ctx) {
        
    }

    @Override
    public void enterArray_initializer(CSharpParser.Array_initializerContext ctx) {
        jplagParser.add(ARRAY_INITIALIZER_BEGIN, ctx.getStart());
    }

    @Override
    public void exitArray_initializer(CSharpParser.Array_initializerContext ctx) {
        jplagParser.add(ARRAY_INITIALIZER_END, ctx.getStop());
    }

    @Override
    public void enterVariant_type_parameter_list(CSharpParser.Variant_type_parameter_listContext ctx) {
        
    }

    @Override
    public void exitVariant_type_parameter_list(CSharpParser.Variant_type_parameter_listContext ctx) {
        
    }

    @Override
    public void enterVariant_type_parameter(CSharpParser.Variant_type_parameterContext ctx) {
        
    }

    @Override
    public void exitVariant_type_parameter(CSharpParser.Variant_type_parameterContext ctx) {
        
    }

    @Override
    public void enterVariance_annotation(CSharpParser.Variance_annotationContext ctx) {
        
    }

    @Override
    public void exitVariance_annotation(CSharpParser.Variance_annotationContext ctx) {
        
    }

    @Override
    public void enterInterface_base(CSharpParser.Interface_baseContext ctx) {
        
    }

    @Override
    public void exitInterface_base(CSharpParser.Interface_baseContext ctx) {
        
    }

    @Override
    public void enterInterface_body(CSharpParser.Interface_bodyContext ctx) {
        
    }

    @Override
    public void exitInterface_body(CSharpParser.Interface_bodyContext ctx) {
        
    }

    @Override
    public void enterInterface_member_declaration(CSharpParser.Interface_member_declarationContext ctx) {
        
    }

    @Override
    public void exitInterface_member_declaration(CSharpParser.Interface_member_declarationContext ctx) {
        
    }

    @Override
    public void enterInterface_accessors(CSharpParser.Interface_accessorsContext ctx) {
        
    }

    @Override
    public void exitInterface_accessors(CSharpParser.Interface_accessorsContext ctx) {
        
    }

    @Override
    public void enterEnum_base(CSharpParser.Enum_baseContext ctx) {
        
    }

    @Override
    public void exitEnum_base(CSharpParser.Enum_baseContext ctx) {
        
    }

    @Override
    public void enterEnum_body(CSharpParser.Enum_bodyContext ctx) {
        jplagParser.add(ENUM_BODY, ctx.getStart());
    }

    @Override
    public void exitEnum_body(CSharpParser.Enum_bodyContext ctx) {
    }

    @Override
    public void enterEnum_member_declaration(CSharpParser.Enum_member_declarationContext ctx) {
        
    }

    @Override
    public void exitEnum_member_declaration(CSharpParser.Enum_member_declarationContext ctx) {
        
    }

    @Override
    public void enterGlobal_attribute_section(CSharpParser.Global_attribute_sectionContext ctx) {
        
    }

    @Override
    public void exitGlobal_attribute_section(CSharpParser.Global_attribute_sectionContext ctx) {
        
    }

    @Override
    public void enterGlobal_attribute_target(CSharpParser.Global_attribute_targetContext ctx) {
        
    }

    @Override
    public void exitGlobal_attribute_target(CSharpParser.Global_attribute_targetContext ctx) {
        
    }

    @Override
    public void enterAttributes(CSharpParser.AttributesContext ctx) {
        
    }

    @Override
    public void exitAttributes(CSharpParser.AttributesContext ctx) {
        
    }

    @Override
    public void enterAttribute_section(CSharpParser.Attribute_sectionContext ctx) {
        
    }

    @Override
    public void exitAttribute_section(CSharpParser.Attribute_sectionContext ctx) {
        
    }

    @Override
    public void enterAttribute_target(CSharpParser.Attribute_targetContext ctx) {
        
    }

    @Override
    public void exitAttribute_target(CSharpParser.Attribute_targetContext ctx) {
        
    }

    @Override
    public void enterAttribute_list(CSharpParser.Attribute_listContext ctx) {
        
    }

    @Override
    public void exitAttribute_list(CSharpParser.Attribute_listContext ctx) {
        
    }

    @Override
    public void enterAttribute(CSharpParser.AttributeContext ctx) {
        
    }

    @Override
    public void exitAttribute(CSharpParser.AttributeContext ctx) {
        
    }

    @Override
    public void enterAttribute_argument(CSharpParser.Attribute_argumentContext ctx) {
        
    }

    @Override
    public void exitAttribute_argument(CSharpParser.Attribute_argumentContext ctx) {
        
    }

    @Override
    public void enterPointer_type(CSharpParser.Pointer_typeContext ctx) {
        
    }

    @Override
    public void exitPointer_type(CSharpParser.Pointer_typeContext ctx) {
        
    }

    @Override
    public void enterFixed_pointer_declarators(CSharpParser.Fixed_pointer_declaratorsContext ctx) {
        
    }

    @Override
    public void exitFixed_pointer_declarators(CSharpParser.Fixed_pointer_declaratorsContext ctx) {
        
    }

    @Override
    public void enterFixed_pointer_declarator(CSharpParser.Fixed_pointer_declaratorContext ctx) {

    }

    @Override
    public void exitFixed_pointer_declarator(CSharpParser.Fixed_pointer_declaratorContext ctx) {
        
    }

    @Override
    public void enterFixed_pointer_initializer(CSharpParser.Fixed_pointer_initializerContext ctx) {
        
    }

    @Override
    public void exitFixed_pointer_initializer(CSharpParser.Fixed_pointer_initializerContext ctx) {
        
    }

    @Override
    public void enterFixed_size_buffer_declarator(CSharpParser.Fixed_size_buffer_declaratorContext ctx) {
        
    }

    @Override
    public void exitFixed_size_buffer_declarator(CSharpParser.Fixed_size_buffer_declaratorContext ctx) {
        
    }

    @Override
    public void enterLocal_variable_initializer_unsafe(CSharpParser.Local_variable_initializer_unsafeContext ctx) {
        
    }

    @Override
    public void exitLocal_variable_initializer_unsafe(CSharpParser.Local_variable_initializer_unsafeContext ctx) {
        
    }

    @Override
    public void enterRight_arrow(CSharpParser.Right_arrowContext ctx) {
        
    }

    @Override
    public void exitRight_arrow(CSharpParser.Right_arrowContext ctx) {
        
    }

    @Override
    public void enterRight_shift(CSharpParser.Right_shiftContext ctx) {
        
    }

    @Override
    public void exitRight_shift(CSharpParser.Right_shiftContext ctx) {
        
    }

    @Override
    public void enterRight_shift_assignment(CSharpParser.Right_shift_assignmentContext ctx) {
        
    }

    @Override
    public void exitRight_shift_assignment(CSharpParser.Right_shift_assignmentContext ctx) {
        
    }

    @Override
    public void enterLiteral(CSharpParser.LiteralContext ctx) {
        
    }

    @Override
    public void exitLiteral(CSharpParser.LiteralContext ctx) {
        
    }

    @Override
    public void enterBoolean_literal(CSharpParser.Boolean_literalContext ctx) {
        
    }

    @Override
    public void exitBoolean_literal(CSharpParser.Boolean_literalContext ctx) {
        
    }

    @Override
    public void enterString_literal(CSharpParser.String_literalContext ctx) {
        
    }

    @Override
    public void exitString_literal(CSharpParser.String_literalContext ctx) {
        
    }

    @Override
    public void enterInterpolated_regular_string(CSharpParser.Interpolated_regular_stringContext ctx) {
        
    }

    @Override
    public void exitInterpolated_regular_string(CSharpParser.Interpolated_regular_stringContext ctx) {
        
    }

    @Override
    public void enterInterpolated_verbatium_string(CSharpParser.Interpolated_verbatium_stringContext ctx) {
        
    }

    @Override
    public void exitInterpolated_verbatium_string(CSharpParser.Interpolated_verbatium_stringContext ctx) {
        
    }

    @Override
    public void enterInterpolated_regular_string_part(CSharpParser.Interpolated_regular_string_partContext ctx) {
        
    }

    @Override
    public void exitInterpolated_regular_string_part(CSharpParser.Interpolated_regular_string_partContext ctx) {
        
    }

    @Override
    public void enterInterpolated_verbatium_string_part(CSharpParser.Interpolated_verbatium_string_partContext ctx) {
        
    }

    @Override
    public void exitInterpolated_verbatium_string_part(CSharpParser.Interpolated_verbatium_string_partContext ctx) {
        
    }

    @Override
    public void enterInterpolated_string_expression(CSharpParser.Interpolated_string_expressionContext ctx) {
        
    }

    @Override
    public void exitInterpolated_string_expression(CSharpParser.Interpolated_string_expressionContext ctx) {
        
    }

    @Override
    public void enterKeyword(CSharpParser.KeywordContext ctx) {
        
    }

    @Override
    public void exitKeyword(CSharpParser.KeywordContext ctx) {
        
    }

    @Override
    public void enterClass_definition(CSharpParser.Class_definitionContext ctx) {
        jplagParser.add(CLASS_DEFINITION_BEGIN, ctx.getStart());
    }

    @Override
    public void exitClass_definition(CSharpParser.Class_definitionContext ctx) {
        jplagParser.add(CLASS_DEFINITION_END, ctx.getStop());
    }

    @Override
    public void enterStruct_definition(CSharpParser.Struct_definitionContext ctx) {
        
    }

    @Override
    public void exitStruct_definition(CSharpParser.Struct_definitionContext ctx) {
        
    }

    @Override
    public void enterInterface_definition(CSharpParser.Interface_definitionContext ctx) {
        jplagParser.add(INTERFACE_BEGIN, ctx.getStart());
    }

    @Override
    public void exitInterface_definition(CSharpParser.Interface_definitionContext ctx) {
        jplagParser.add(INTERFACE_END, ctx.getStop());
    }

    @Override
    public void enterEnum_definition(CSharpParser.Enum_definitionContext ctx) {
        jplagParser.add(ENUM_DEFINITION_BEGIN, ctx.getStart());
    }

    @Override
    public void exitEnum_definition(CSharpParser.Enum_definitionContext ctx) {
        jplagParser.add(ENUM_DEFINITION_END, ctx.getStart());
    }

    @Override
    public void enterDelegate_definition(CSharpParser.Delegate_definitionContext ctx) {
        
    }

    @Override
    public void exitDelegate_definition(CSharpParser.Delegate_definitionContext ctx) {
        
    }

    @Override
    public void enterEvent_declaration(CSharpParser.Event_declarationContext ctx) {
        
    }

    @Override
    public void exitEvent_declaration(CSharpParser.Event_declarationContext ctx) {
        
    }

    @Override
    public void enterField_declaration(CSharpParser.Field_declarationContext ctx) {
        
    }

    @Override
    public void exitField_declaration(CSharpParser.Field_declarationContext ctx) {
        
    }

    @Override
    public void enterProperty_declaration(CSharpParser.Property_declarationContext ctx) {
        
    }

    @Override
    public void exitProperty_declaration(CSharpParser.Property_declarationContext ctx) {
        
    }

    @Override
    public void enterConstant_declaration(CSharpParser.Constant_declarationContext ctx) {

    }

    @Override
    public void exitConstant_declaration(CSharpParser.Constant_declarationContext ctx) {
        
    }

    @Override
    public void enterIndexer_declaration(CSharpParser.Indexer_declarationContext ctx) {
        
    }

    @Override
    public void exitIndexer_declaration(CSharpParser.Indexer_declarationContext ctx) {
        
    }

    @Override
    public void enterDestructor_definition(CSharpParser.Destructor_definitionContext ctx) {
        
    }

    @Override
    public void exitDestructor_definition(CSharpParser.Destructor_definitionContext ctx) {
        
    }

    @Override
    public void enterConstructor_declaration(CSharpParser.Constructor_declarationContext ctx) {
        jplagParser.add(CONSTRUCTOR_DECLARATION_BEGIN,ctx.getStart());
    }

    @Override
    public void exitConstructor_declaration(CSharpParser.Constructor_declarationContext ctx) {
        jplagParser.add(CONSTRUCTOR_DECLARATION_END,ctx.getStop());
    }

    @Override
    public void enterMethod_declaration(CSharpParser.Method_declarationContext ctx) {
        if (ctx.getStart().getText().equals("void")){
            jplagParser.add(VOID, ctx.getStart());
        }
        jplagParser.add(METHOD_DECLARATION_BEGIN, ctx.getStart());
    }

    @Override
    public void exitMethod_declaration(CSharpParser.Method_declarationContext ctx) {
        jplagParser.add(METHOD_DECLARATION_END, ctx.getStop());
    }

    @Override
    public void enterMethod_member_name(CSharpParser.Method_member_nameContext ctx) {
        
    }

    @Override
    public void exitMethod_member_name(CSharpParser.Method_member_nameContext ctx) {
        
    }

    @Override
    public void enterOperator_declaration(CSharpParser.Operator_declarationContext ctx) {
        
    }

    @Override
    public void exitOperator_declaration(CSharpParser.Operator_declarationContext ctx) {
        
    }

    @Override
    public void enterArg_declaration(CSharpParser.Arg_declarationContext ctx) {
        
    }

    @Override
    public void exitArg_declaration(CSharpParser.Arg_declarationContext ctx) {
        
    }

    @Override
    public void enterMethod_invocation(CSharpParser.Method_invocationContext ctx) {
        
    }

    @Override
    public void exitMethod_invocation(CSharpParser.Method_invocationContext ctx) {
        
    }

    @Override
    public void enterObject_creation_expression(CSharpParser.Object_creation_expressionContext ctx) {

    }

    @Override
    public void exitObject_creation_expression(CSharpParser.Object_creation_expressionContext ctx) {
        
    }

    @Override
    public void enterIdentifier(CSharpParser.IdentifierContext ctx) {
        
    }

    @Override
    public void exitIdentifier(CSharpParser.IdentifierContext ctx) {
        
    }

    @Override
    public void visitTerminal(TerminalNode tn) {
        
    }

    @Override
    public void visitErrorNode(ErrorNode en) {
        
    }

    @Override
    public void enterEveryRule(ParserRuleContext prc) {
        
    }

    @Override
    public void exitEveryRule(ParserRuleContext prc) {
        
    }

    @Override
    public void enterElseStatement(CSharpParser.ElseStatementContext ctx) {
        jplagParser.add(ELSE_BEGIN, ctx.getStart());
    }

    @Override
    public void exitElseStatement(CSharpParser.ElseStatementContext ctx) {
        jplagParser.add(ELSE_END, ctx.getStop());
    }   

    @Override
    public void enterNcExpression(CSharpParser.NcExpressionContext ctx) {
    }

    @Override
    public void exitNcExpression(CSharpParser.NcExpressionContext ctx) {
    }

    @Override
    public void enterTernaryExpression(CSharpParser.TernaryExpressionContext ctx) {
        jplagParser.add(TERNARY_EXPRESSION, ctx.getStart());
    }

    @Override
    public void exitTernaryExpression(CSharpParser.TernaryExpressionContext ctx) {
    }
}
