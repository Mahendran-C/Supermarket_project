USE [Supermarket]
GO

/****** Object:  Table [dbo].[customer]    Script Date: 8/1/2020 12:12:00 AM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[customer]') AND type in (N'U'))
DROP TABLE [dbo].[customer]
GO

/****** Object:  Table [dbo].[customer]    Script Date: 8/1/2020 12:12:00 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[customer](
	[customer_id] [int] identity(1,1) NOT NULL,
	[fIrstName] [varchar](20) NOT NULL,
	[lastName] [varchar](20) NOT NULL,
	[contactNo] [varchar](15) NOT NULL,
	[emailId] [varchar](30) NOT NULL,
	[password] [varchar](20) NOT NULL,
	[address] [varchar](150) NOT NULL,
	[city] [varchar](20) NOT NULL,
	[state] [varchar](25) NOT NULL,
	[landmark] [varchar](50) NULL,
	[pincode] [nchar](8) NOT NULL,
	[type] [varchar](20) NOT NULL,
	[status] [varchar](20) NOT NULL,
	[createdat] [varchar](50)  NULL,
 CONSTRAINT [PK_Customer] PRIMARY KEY CLUSTERED 
(
	[customer_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO


